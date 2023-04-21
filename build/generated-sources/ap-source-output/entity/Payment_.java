package entity;

import entity.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-21T22:05:18")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, Double> total;
    public static volatile SingularAttribute<Payment, Order1> orderId;
    public static volatile SingularAttribute<Payment, Integer> paymentId;
    public static volatile SingularAttribute<Payment, String> type;

}