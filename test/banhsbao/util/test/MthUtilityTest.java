/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banhsbao.util.test;

import banhsbao.util.MathUtility;
import static banhsbao.util.MathUtility.getFactorial;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MthUtilityTest {
    
    @Test()
    public void getFactorial_RunsWell_IfValidArgument(){
        System.out.println("blala");
        getFactorial(5);
        System.out.println("Good luck");
        System.out.println("Hope that you all will get the GREEN ICONS");
    }
    //ngoại lệ ko phải là 1
}
