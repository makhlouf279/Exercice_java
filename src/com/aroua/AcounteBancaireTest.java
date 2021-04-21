package com.aroua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AcounteBancaireTest {

    @Test
public void test_deposer(){
        AcounteBancaire acc=new AcounteBancaire(1000);
        acc.deposer(1500);
        Assertions.assertEquals(2500, acc.getBalance());
    }
   @Test
    public void test_retirer(){
        AcounteBancaire acc=new AcounteBancaire(2500);
        acc.retirer(400);
        Assertions.assertEquals(2100, acc.getBalance());
    }
}