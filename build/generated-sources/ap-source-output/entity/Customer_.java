package entity;

import entity.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-21T22:05:18")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> password;
    public static volatile SingularAttribute<Customer, String> customerContact;
    public static volatile SingularAttribute<Customer, Integer> customerId;
    public static volatile ListAttribute<Customer, Order1> order1List;
    public static volatile SingularAttribute<Customer, String> customerName;
    public static volatile SingularAttribute<Customer, String> email;

}