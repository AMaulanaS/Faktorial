/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6;

import java.util.Scanner;

class Faktorial{
    int a;
    void fak (int a)
    {
        int i=1,s=1,h;
        while(i<=a)
        {
            h=s*i;
            System.out.println(""+s+"x"+i+"="+h);
            i++;
            s=h;
        }
    }

    
}

public class PBO6{
    void while_10()
{
    int i=1;
    while(i<=10)
    {
        System.out.println(i+" ");
        i++;
    }
}
void doWhile_10()
{
    int i=1;
    do
    {
        System.out.println(i+" ");
        i++;
    }while (i<=10);
}
void forl_10()
{
    for (int i=1;i<=10;i++)
    {
        System.out.println(i  + " ");
    }
}

public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
Faktorial sempak=new Faktorial();
sempak.fak(5);
PBO6 looping = new PBO6();
looping.while_10();
looping.doWhile_10();
looping.forl_10();

long fak = 1;
int angka = 0;
    System.out.println("masukan bang,,,, udah gak tahan : ");
    angka = in.nextInt();
    for(int i=1;i<=angka;i++)
    {
        fak = i*fak;
        System.out.println(i+"x"+(i+1)+"="+fak);
    }
    System.out.println("zonakimochi dari Jun Aizawa "+angka+" adalah "+fak);
}
}
