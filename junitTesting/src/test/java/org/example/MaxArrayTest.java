package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class MaxArrayTest {
    //MaxArray ma=new MaxArray();
    int ar[]={1,2,3,4,5};
    @Test
    public void maxArrTest(){
      int big =MaxArray.maxArr(ar);
      int exp=5;
      Assert.assertEquals(exp,big);
    }
}
