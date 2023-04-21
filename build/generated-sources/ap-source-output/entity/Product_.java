package entity;

import entity.OrderList;
import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-21T22:05:18")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Serializable> productImage;
    public static volatile SingularAttribute<Product, Integer> quantity;
    public static volatile SingularAttribute<Product, Integer> productId;
    public static volatile ListAttribute<Product, OrderList> orderListList;
    public static volatile SingularAttribute<Product, String> productName;
    public static volatile SingularAttribute<Product, Double> productPrice;
    public static volatile SingularAttribute<Product, String> productDescription;
    public static volatile SingularAttribute<Product, Integer> status;

}