package entity;

import entity.Order1;
import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-21T22:05:18")
@StaticMetamodel(OrderList.class)
public class OrderList_ { 

    public static volatile SingularAttribute<OrderList, Integer> orderListId;
    public static volatile SingularAttribute<OrderList, Integer> quantity;
    public static volatile SingularAttribute<OrderList, Product> productId;
    public static volatile SingularAttribute<OrderList, Order1> orderId;

}