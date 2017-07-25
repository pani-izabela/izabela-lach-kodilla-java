package com.kodilla.stream.forum;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ForumUser {
    private final String username;
    private final String realName;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    public ForumUser(final String username, final String realName, final String location) {
        this.username = username;
        this.realName = realName;
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        return username.equals(forumUser.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    public void addFriend(ForumUser user) {
        friends.add(user);
    }

    public boolean removeFriend(ForumUser user) {
        return friends.remove(user);
    }

    public Set<String> getLocationsOfFriends() {
        return friends.stream() //metoda tworzy strumien na kolekcji friends
                .map(friend -> friend.getLocation())//modyfikuje w strumieniu obiekty z typu ForumUser(takie były w kolekcji) na String (typ location)
                .collect(Collectors.toSet());//tworzona jest kolekcja wynikowa typu Set
    }

    public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream()//uruchamiany jest strumień na kolekcji friends
                .flatMap(user -> user.getFriends().stream())//dla każdego przyjaciela (user) pobieramy jego listę przyjaciół (user.getFriends()) i ją przekazujemy do dalszego przetwarzania w postaci nowego strumienia Stream. Od tego momentu pracujemy nie na liście przyjaciół, lecz na liście "przyjaciół przyjaciół".
                .filter(user -> user != this)//wykluczamy ze zbioru wynikowego odwołania do "samego siebie", też jesteśmy przyjacielem naszych przyjaciół
                .map(ForumUser::getLocation)//transformujemy strumień tak, że zamiast obiektów ForumUser, dalej będą już przez niego przepływały jedynie obiekty String będące lokalizacjami użytkowników (pobieramy je przy pomocy metody ForumUser::getLocation).
                .collect(Collectors.toSet());//dokonujemy złożenia strumienia wynikowego w kolekcję typu Set zawierającą listę lokalizacji "przyjaciół przyjaciół"
    }

}
