package main;

import roomdetails.room;
import hostels_fees.fees_collection;
import HOSTEL_DETAILS.hostel;
import storage.inventory;
import student.student_detail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class subham_topper extends Thread{
    static int var1=0;//var1 uses for hostel detail purpose
    static int var2=0;//it is used for student details purpose

    public static void main(String[] args) throws InterruptedException, IOException {
        int var3;
        int var4;
        String name="y";
        fees_collection [] var5=new fees_collection[10];
        room [] var6=new  room[10];
        hostel [] var7=new  hostel[10];
        inventory [] var8=new inventory[10];
        student_detail [] var9=new student_detail[10];
        System.out.println(" ");
        Thread.sleep(500);
        System.out.println("* \t\tHOSTEL ACCOMMODATION SYSTEM \t\t**");
        System.out.println(" ");
        System.out.println(" ");
        Thread.sleep(500);
        System.out.println("\t\t\t*****");
        Thread.sleep(500);
        System.out.printf("\t\t\t\t\t \t\tcreated by team 11\t\t\t\t\t\t\t\t\t\t\n");
        Thread.sleep(500);
        System.out.println("\t\t\t*****");
        System.out.println(" ");
        System.out.println(" ");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t*** our team members are***");
        Thread.sleep(500);
        System.out.println("Asit");
        Thread.sleep(500);
        System.out.println("Subham");
        Thread.sleep(500);
        System.out.println("sourav");
        Thread.sleep(500);
        System.out.println("Nitish");
        Thread.sleep(500);
        System.out.println("Biranchi");
        Thread.sleep(500);
        System.out.println("manaswini");
        Thread.sleep(500);
        System.out.println("omi sneha");
        Thread.sleep(500);
        System.out.println("Ankita");
        Thread.sleep(500);
        System.out.println("soubhagya");
        Thread.sleep(500);
        System.out.println("Ashutosh");
        System.out.println(" ");
        System.out.println(" ");
        while (name.equalsIgnoreCase(("y"))){
            System.out.println("enter your choice");
            System.out.println("1.ADD DETAILS \n2.UPDATE DETAILS \n3.DISPLAY DETAILS \n4.EXIT\n5.DISPLAY DETAILS");
            Scanner sc=new Scanner(System.in);
            int choice= sc.nextInt();
            File obj=new File("initial.txt");
            File obj7=new File("hostel_detail.txt");
            if (obj.createNewFile())
            {
                System.out.println("file also has been created");
            }
            obj7.createNewFile();
            switch (choice)
            {
                case 1:
                    System.out.println("1-HOSTEL DETAILS \n2-STUDENT DETAILS");
                    int choice2=sc.nextInt();
                    switch (choice2)
                    {
                        case 1:
                            var7[var1]=new hostel();//object
                            var8[var2]=new inventory();
                            System.out.println("enter  the details of the students given below \n1)name of the hostel\n2)number of student\n3)number of rooms");
                            String hostel_name= sc.next();
                            long total_number_of_students=sc.nextLong();
                            long total_number_of_rooms=sc.nextLong();
                            var7[var1].setHostel_name(hostel_name);
                            var7[var1].setStudent_count(total_number_of_students);
                            var7[var1].setRoom_count(total_number_of_rooms);

                            System.out.println("enter the total number of beds,desk,sports_goods & damage_goods");
                            int beds=sc.nextInt();
                            int desk=sc.nextInt();
                            int sports_goods=sc.nextInt();
                            int damage_goods=sc.nextInt();
                            var8[var1].setBeds(beds);
                            var8[var1].setDamaged_goods(damage_goods);
                            var8[var1].setDesks(desk);
                            var8[var1].setSport_goods(sports_goods);
                            var1++;
                            FileWriter obj2=new FileWriter("hostel_detail.txt",true);
                            obj2.write("name of the hostel:"+hostel_name+"\n");
                            obj2.write("number of students"+total_number_of_rooms+"\n");
                            obj2.write("number of students"+total_number_of_rooms+"\n");
                            obj2.write("number of rooms"+total_number_of_rooms+"\n");
                            obj2.write("number of beds"+beds+"\n");
                            obj2.write("number of desks"+desk+"\n");
                            obj2.write("number of sport goods"+sports_goods+"\n");
                            obj2.write("number of damage_beds"+damage_goods+"\n");
                            obj2.close();
                            break;

                        case 2:
                            var5[var2]=new fees_collection();
                            var6[var2]=new room();
                            var9[var2]=new student_detail();
                            System.out.println("enter the student details given below\n1)NAME\n2)roll_number\n3)registration_number\n4)phone_number\n5)father_name\n6)mother-name");
                            String name2=sc.next();
                            int roll=sc.nextInt();
                            long reg_number=sc.nextLong();
                            long phone_number=sc.nextLong();
                            String father_name=sc.next();
                            String mother_name=sc.next();
                            var9[var2].setName(name2);
                            var9[var2].setFather_name(father_name);
                            var9[var2].setPhone_number(phone_number);
                            var9[var2].setRoll_number(roll);
                            var9[var2].setReg_number(reg_number);
                            var9[var2].setMother_name(mother_name);
                            System.out.println("enter the details given below\n1)room_number\n2)room_type\n3)hostel_name");
                            int room_number=sc.nextInt();
                            String room_type=sc.next();
                            String name_of_the_hostel=sc.next();
                            var6[var2].setRoom_number(room_number);
                            var6[var2].setRoom_type(room_type);//put sc.next
                            var6[var2].setHostels(name_of_the_hostel);
                            System.out.println("enter mess name");
                            String mess=sc.next();
                            var6[var2].setMess(mess);
                            FileWriter obj3=new FileWriter("initial_detail.txt",true);
                            obj3.write("name of the student:"+name2);
                            obj3.write("roll_number of the student:"+roll);
                            obj3.write("reg_number of the student:"+reg_number);
                            obj3.write("phone number of the student:"+phone_number);
                            obj3.write("father name of the student:"+father_name);
                            obj3.write("mother name of the student:"+mother_name);
                            obj3.write("room type of the student"+room_type);
                            obj3.write("hostel_name :"+name_of_the_hostel);
                            obj3.close();
                            if (var6[var2].getRoom_type().equalsIgnoreCase(("single_seater")))
                            {
                                var5[var2].setRoom_fees(3000);
                            }
                            else
                            {
                                var5[var2].setRoom_fees(7000);
                            }
                            if (var6[var2].getMess().equalsIgnoreCase(("double_seater")))
                            {
                                var5[var2].setMess_fees(15000);
                            }
                            else if (var6[var2].getMess().equalsIgnoreCase(("triple_seater")))
                            {
                                var5[var2].setMess_fees(16000);
                            }
                            else if(var6[var2].getMess().equalsIgnoreCase(("four_seater")))
                            {
                                var5[var2].setMess_fees(17000);
                            }
                            else
                            {
                                var5[var2].setMess_fees(27000);
                            }
                            var5[var2].computing_total_fees();
                            var2++;
                            break;}//ending of inner switch
                    break;
                case 2:
                    System.out.println("1-hostel_details 2-student_details");//var7 and var8 is used for hostel.
                    int choice3=sc.nextInt();
                    switch (choice3)
                    {
                        case 1:
                            FileWriter obj4=new FileWriter("hostel_detail.txt",true);
                            System.out.println("enter the name of the hostel");
                            String about_hostel=sc.next();
                            obj4.write("here updating takes place");
                            obj4.write("hostel name after updation:"+about_hostel);
                            for (var3=0;var3<=var1;var3++) {
                                if (var7[var3].getHostel_name().equalsIgnoreCase(about_hostel)) {
                                    System.out.printf("what you want to update are some options to do so \n 1)beds\n2)desk\n3)sportsgood\n4)damagegoods\n5)student_count");
                                    System.out.println("here you are ready to go");
                                    int choice4 = sc.nextInt();
                                    switch (choice4) {
                                        case 1:
                                            System.out.println("enter the total number of beds u want to update from earlier state");
                                            int beds = sc.nextInt();
                                            System.out.println("updated successfully");
                                            obj4.write("no of beds after updating"+beds);
                                            var8[var1].setBeds(beds);
                                            break;
                                        case 2:
                                            System.out.println("enter the total number of desks you want tyo update from earlier stage");
                                            int desks = sc.nextInt();
                                            obj4.write("number of desks"+desks);
                                            var8[var1].setDesks(desks);
                                            System.out.println("successfully it is updated");
                                            break;
                                        case 3:
                                            System.out.println("enter the number of goods which are related to the sports you want to update from the earlier stage");
                                            int sporty_goods = sc.nextInt();
                                            obj4.write("number of sport goods after updation"+sporty_goods);
                                            var8[var1].setSport_goods(sporty_goods);
                                            System.out.println("successfully it is updated");
                                            break;
                                        case 4:
                                            System.out.println("enter the number of damaged goods you want to update from earlier stage");
                                            int damaged_goods = sc.nextInt();
                                            obj4.write("damage goods after updation"+damaged_goods);
                                            var8[var1].setDamaged_goods(damaged_goods);
                                            System.out.println("successfully it is updated");
                                            break;
                                        case 5:
                                            System.out.println("enter the student count which u want to update from earlier stage");
                                            int stud = sc.nextInt();
                                            obj4.write("student counts after updation"+stud);
                                            var7[var1].setStudent_count(stud);
                                            System.out.println("successfully it is updated");
                                            obj4.close();
                                            break;

                                    }break;//inner switch choice4
                                } //choice3
                            }break;//choice 2
                        case 2:
                            System.out.println("enter the student register number");
                            FileWriter obj8=new FileWriter("initial.txt");
                            obj8.write("updating student details");
                            long reg_number=sc.nextLong();
                            obj8.write("updating the details of a student whose reg number is"+reg_number);
                            for (var4=0;var4<=var2;var4++){
                                if(var9[var4].getReg_number()==reg_number){
                                    System.out.println("what you want to update \n 1)name \n2) phone_number \n 3)room number \n 4)name of the mess/hostel");
                                    int choice5=sc.nextInt();
                                    switch (choice5)
                                    {
                                        case 1:
                                            System.out.println("enter your new name if u have updated");
                                            String name3=sc.next();
                                            var9[var4].setName(name3);
                                            obj8.write("name of the student:-"+name3);
                                            break;
                                        case 2:
                                            System.out.println("enter your new contact number");
                                            long numbers=sc.nextLong();
                                            var9[var4].setPhone_number(numbers);
                                            obj8.write("contact number-:"+numbers);
                                            break;
                                        case 3:
                                            System.out.println("enter your new room number");
                                            int rooms=sc.nextInt();
                                            var6[var4].setRoom_number(rooms);
                                            obj8.write("room number:-"+rooms);
                                            break;
                                        case 4:
                                            System.out.println("enter your new mess name");
                                            String mess_name=sc.next();
                                            if(var6[var4].getMess().equalsIgnoreCase(("yummy")))
                                            {
                                                var5[var4].setMess_fees(7000);
                                                obj8.write("mess name updation to yummy");
                                            }
                                            else if(var6[var4].getMess().equalsIgnoreCase(("green_garden")))
                                            {
                                                var5[var4].setMess_fees(10000);
                                                obj8.write("mess name has been updated to green garden");
                                            }
                                            else
                                            {
                                                var5[var4].setMess_fees(15000);
                                                obj8.write("mess name has been updated to food plaza");

                                            }
                                            var5[var4].computing_total_fees();
                                            break;
                                    }break;
                                }
                            }
                    }break;
                case 3:
                    System.out.println("enter your choice to display 1)hostel details\n2)student details");
                    int choice6= sc.nextInt();
                    switch (choice6)
                    {
                        case 1:
                            System.out.println("enter the name of the hostel");
                            String hostel_name=sc.next();
                            for (var3=0;var3<=var1;var3++)
                            {
                                if (var7[var3].getHostel_name().equalsIgnoreCase(hostel_name)){
                                    System.out.println("name of the hostel="+var7[var3].getHostel_name());
                                    System.out.println("number of students in a hostel="+var7[var3].getStudent_count());
                                    System.out.println("total number of rooms count="+var7[var3].getRoom_count());
                                    System.out.println("total number of damaged goods="+var8[var3].getDamaged_goods());
                                    System.out.println("Total number of desks="+var8[var3].getDesks());
                                    System.out.println("Total number of beds="+var8[var3].getBeds());
                                    System.out.println("Total number of sport goods="+var8[var3].getSport_goods());
                                    System.out.println("Total number of desks="+var8[var3].getDesks());
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("enter the  registration number of the student");
                            long reg_number=sc.nextLong();
                            for (var4=0;var4<=var2;var4++)
                            {
                                if (var9[var4].getReg_number()==reg_number)//we can't use the equal ignore case because it is only applicable for string datatype
                                {
                                    System.out.println("name of the student:"+var9[var4].getName());
                                    System.out.println("registration number of the student:"+var9[var4].getReg_number());
                                    System.out.println("roll number of the student:"+var9[var4].getRoll_number());
                                    System.out.println("phone number of the student:"+var9[var4].getPhone_number());
                                    System.out.println("father name of the student:"+var9[var4].getFather_name());
                                    System.out.println("mother name of the student:"+var9[var4].getMother_name());
                                    System.out.println("room number of the student:"+var6[var4].getRoom_number());
                                    System.out.println("room type of the student:"+var6[var4].getRoom_type());
                                    System.out.println("hostel name:"+var6[var4].getHostels());
                                    System.out.println("mess name:"+var6[var4].getMess());
                                    System.out.println("room fees:"+var5[var4].getRoom_fees());
                                    System.out.println("mess fees:"+var5[var4].getMess_fees());
                                    System.out.println("computed cost");
                                    var5[var4].computing_total_fees();
                                    break;
                                }
                            }break;

                    }
                    break;
                case 5:
                    System.out.println("1)want to display hostel details\n2)want to display student details");
                    int choice10= sc.nextInt();
                    switch (choice10)
                    {
                        case 1:
                            File obj12=new File("hostel_detail.txt");
                            Scanner sc2=new Scanner(obj12);
                            while (sc2.hasNextLine())
                            {
                                String name2=sc2.nextLine();
                                System.out.println(name2);
                            }
                        case 2:
                            File obj13=new File("initial.txt");
                            Scanner sc3=new Scanner(obj13);
                            while (sc3.hasNextLine())
                            {
                                String name3=sc3.nextLine();
                                System.out.println(name3);
                            }
                    }

            }
            System.out.println("if you want to continue then print either 'y' or 'n'");
            String na=sc.next();
            if(na.equals('y')||na.equals('n')) {
            	System.exit(0);
            }
        }
    }

}