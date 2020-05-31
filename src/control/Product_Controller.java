/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Product;


/**
 *
 * @author Daniel
 */
public class Product_Controller {

    private final Product p = new Product();

    public void register(String product, int unitPrice, int cant, int total) {
        p.setProduct(product);
        p.setUnitPrice(unitPrice);
        p.setCant(cant);
        p.setTotal(total);
    }

    public Object show() {
        Object[] o = new Object[4];
        o[0] = p.getProduct();
        o[1] = p.getUnitPrice();
        o[2] = p.getCant();
        o[3] = p.getTotal();
        return o;
    }

}
