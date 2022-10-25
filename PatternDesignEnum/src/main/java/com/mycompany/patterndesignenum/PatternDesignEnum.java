/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.patterndesignenum;

import Enum.Emeliyyat;
import java.text.ParseException;

/**
 *
 * @author ASUS
 */
public class PatternDesignEnum {

    public static void main(String[] args) throws ParseException {
//       Date d= new Date();
//        System.out.println(d);
//        System.out.println(d.getTime());
//        gettime 1970den indiye kimi millisecondla hesablayir
//String dd= sdf.format(d);
//        System.out.println(dd);

//String s="12-02-2022";
//Date dd=sdf.parse(s); parsa stringe gore parcalayir

//        System.out.println(dd);
//Scanner sc =new Scanner(System.in);
//        System.out.println("type birthday client");
//        String datestr=sc.nextLine();
//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//Date dclient=sdf.parse(datestr);
//Date dme=sdf.parse("12-12-2002");
//long client=dclient.getTime();
//long me=dme.getTime();
//long diff=client-me;
//        System.out.println(diff/(24*60*60*1000)/365);
//Enum----
Emeliyyat e=Emeliyyat.TOPLA;
 double net=e.hesabla(12, 13);
        System.out.println(net);
        System.out.println(e.getOpertionsymbol());
        System.out.println(e.getClass().getName());
        System.out.println(e.getClass().getSuperclass());

    }

    
}
