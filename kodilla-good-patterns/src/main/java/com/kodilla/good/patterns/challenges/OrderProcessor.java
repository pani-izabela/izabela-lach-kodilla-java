package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest){
        boolean idOrdered = orderService.order(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getDate());

        if(idOrdered){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getDate());
            return new OrderDTO(orderRequest.getProduct(), orderRequest.getUser(), true);
        }
        else {
            return new OrderDTO(orderRequest.getProduct(), orderRequest.getUser(), false);
        }
    }
}
