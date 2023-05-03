/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_pbo6_no3;
//using namespace std; Tidak dipakai karena kita tidak menggunakan c++
class character{//diubah dari characterr jadi karakter
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    // membuat constructor
        character(String nama, int heal, String weapon, int attackP, int mana){ //dari characteer jadi character dan string s nya huruf besar
        this.nama = nama;
        this.heal = heal; 
        this.weapon = weapon;
        this.attackP = attackP;
        this.mana = mana;
        //digunakan this. agar tidak bingung dalam pemilihan
        //print(nama); cara print di java berbeda
        System.out.println(nama);
    }
    int attack(){
        mana = mana - 5; //kesalahan penulisan dan tidak perlu pake this
        System.out.println(this.nama+" menyerang si sotong"); //kesalahan penulisan
        return mana;
        // system.out.println("sotong terkena demage sebanyak "+this.attackP );
    }
    int damage(int attackP){
        heal = heal - attackP;//tidak perlu pake this dan kesalahan penulisan
        System.out.println("ucup terkena demage sebanyak" + attackP); //kesalahan penulisan
        return heal;
        
    }
    void print(){
        System.out.println("nama: "+ nama);  
        System.out.println("heal: "+ heal);
        System.out.println("weapon: "+weapon);
        System.out.println("attack power: " + attackP); //kesalahan penulisan
        System.out.println("mana : " +mana);
    }
}
public class UTS_PBO6_No3 {
    public static void main(String[] args) {
        character character1 = new character("ucup",100,"pedang excalibur",5,100);
        character1.attack();
        character1.damage(10);//jadi damage
        character1.print();
    }

}


