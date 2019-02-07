package com.example.jeremy.supermarketapp.src;

import com.example.jeremy.supermarketapp.src.constant.GenderType;
import com.example.jeremy.supermarketapp.src.constant.PositionType;
import com.example.jeremy.supermarketapp.src.constant.PurchaseType;
import com.example.jeremy.supermarketapp.src.models.Market;
import com.example.jeremy.supermarketapp.src.models.Person;
import com.example.jeremy.supermarketapp.src.models.Purchase;
import com.example.jeremy.supermarketapp.src.models.PurchaseContainer;
import com.example.jeremy.supermarketapp.src.models.Seller;
import com.example.jeremy.supermarketapp.src.models.User;

public final class Launcher {

    public static void main(String[] args) {
        System.out.print(initMarket().toString());
    }

    private static Market initMarket() {
        Market market =  new Market("Supermarket" ,
                new Seller(new Person("James" , "Wolf" , 21 , GenderType.MALE) , PositionType.HIGH_QUALIFIED) , new PurchaseContainer());
        market.setPurchase(new Purchase(new User(new Person("Emili" , "Forward" , 25 , GenderType.FEMALE) , "emili0000" , "emili@gmail.com") , 154700 , PurchaseType.TV));
        market.setPurchase(new Purchase(new User(new Person("Johnatan" , "Grow" , 44 , GenderType.MALE) , "789045" , "grow999@gmail.com") , 1290000 , PurchaseType.WEAPONS));
        return market;
    }
}
