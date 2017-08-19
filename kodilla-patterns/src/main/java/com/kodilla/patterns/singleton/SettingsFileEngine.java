package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null; //pole statyczne przechowujące referencję do instancji klasy, o nazwie settingsFileEngineInstance
    //pole na razie jest null, ale będziemy je inicjować, gdy tylko będziemy próbowali go użyć
    private String fileName = "";

    private SettingsFileEngine() { //poprzez zmianę public na private ukrywamy konstruktor i nikt nie może go użyć i stworzyć obiektu
    }

    public static SettingsFileEngine getInstance() {//dodanie tej metody, jest jedynym sposobem utworzenia obiektu tej klasy
        if (settingsFileEngineInstance == null) {
            settingsFileEngineInstance = new SettingsFileEngine();
        }
        return settingsFileEngineInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}
