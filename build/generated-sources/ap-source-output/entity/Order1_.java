package entity;

import entity.Customer;
import entity.OrderList;
import entity.Payment;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-21T22:05:18")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Integer> orderId;
    public static volatile SingularAttribute<Order1, Date> dateOrdered;
    public static volatile SingularAttribute<Order1, Customer> customerId;
    public static volatile SingularAttribute<Order1, String> shippingAddress;
    public static volatile ListAttribute<Order1, OrderList> orderListList;
    public static volatile SingularAttribute<Order1, Date> dateDelivered;
    public static volatile SingularAttribute<Order1, Integer> status;
    public static volatile ListAttribute<Order1, Payment> paymentList;

}