import java.util.*;

public class Main1 {


    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Book Book1 = new Book("Demon Slayer: Kimetsu no Yaiba, Vol.1", 7);
        Book Book2 = new Book("Mission: Yozakura Family, Vol.1", 7);
        DVD Dvd1 = new DVD(17, "DeadPool 2");
        DVD Dvd2 = new DVD(30, "TopGun - Maverick");
        Member member1 = new Member("John Tolkin", "Regular", 2378);
        PremiumMember Premmember1 = new PremiumMember("Joe Scally", "Premium", 34892576);
        CD cd1 = new CD("AfterLyfe - Yeat", 15);
        CD cd2 = new CD("Whole Lotta Red - PlayBoi Carti", 23);

        System.out.println();

        System.out.println(Book1);
        System.out.println(Dvd1);
        System.out.println(cd1);
        System.out.println(Premmember1);
        System.out.println(member1);
        System.out.println("TEST COMPLETE");

        System.out.println();

        Scanner sc = new Scanner(System.in);


        while (1==1){
            System.out.println("Warning: Due to high Demand, We only allow ONE ITEM TO BE PURCHASED PER PERSON");
            System.out.println("Please select from the following menu of options.");
            System.out.println("\t 1. Make a Purchase");
            System.out.println("\t 9. Exit");

            int num = sc.nextInt();
            switch (num) {
                
                case 1: 
                    System.out.println("Please Chose from 1 of the following");
                    System.out.println("1 : "+ Book1);
                    System.out.println("2 : "+ Book2);
                    System.out.println("3 : "+ Dvd1);
                    System.out.println("4 : "+ Dvd2);
                    System.out.println("5 : "+ cd1);
                    System.out.println("6 : "+ cd2);
                    int Order = sc.nextInt();

                    if (Order == 1){
                        System.out.println("Your total is $" + Book1.BookCost + ".99");
                        System.out.println("Please Select what member is making this purchase: ");
                        System.out.println("\t 1: Member: " + member1);
                        System.out.println("\t 2: Member: " + Premmember1);
                        System.out.println("\t 3: Skip");
                        System.out.println("\t 4: New Member!!!");
                        int answer = sc.nextInt();

                        if (answer == 4){
                            String name = sc.nextLine();
                            System.out.println("WOW a new member, lets get you signed up!!!");
                            System.out.println("Whats Your Name");
                            name = sc.nextLine();

                            System.out.println("What status would you like?");
                            System.out.println("\t 5: Regular");
                            System.out.println("\t 6: Premium");
                            int Answer = sc.nextInt();

                            if (Answer == 5){
                                String MemStatus = "Regular";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                System.out.println("Your new total is $" + (Book1.BookCost - 2) + ".99");
                                System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                            } else if (Answer == 6){
                                String MemStatus = "Premium";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                if (MemStatus == "Premium"){
                                    System.out.println("Your new total is $" + (Book1.BookCost - 5) + ".99");
                                    System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                                }
                            } else {
                                System.out.print("Your total is $" + Book1.BookCost + ".99");
                                
                            }


                            


                        
                        }else if (answer == 1){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (Book1.BookCost - 2) + ".99");
                        } else if (answer == 2){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (Book1.BookCost - 5) + ".99");
                        }
                        

                    }

                    if (Order == 2){
                        System.out.println("Your total is $" + Book2.BookCost + ".99");
                        System.out.println("Please Select what member is making this purchase: ");
                        System.out.println("\t 1: Member: " + member1);
                        System.out.println("\t 2: Member: " + Premmember1);
                        System.out.println("\t 3: Skip");
                        System.out.println("\t 4: New Member!!!");
                        int answer = sc.nextInt();

                        if (answer == 4){
                            String name = sc.nextLine();
                            System.out.println("WOW a new member, lets get you signed up!!!");
                            System.out.println("Whats Your Name");
                            name = sc.nextLine();

                            System.out.println("What status would you like?");
                            System.out.println("\t 5: Regular");
                            System.out.println("\t 6: Premium");
                            int Answer = sc.nextInt();

                            if (Answer == 5){
                                String MemStatus = "Regular";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                System.out.println("Your new total is $" + (Book2.BookCost - 2) + ".99");
                                System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                            } else if (Answer == 6){
                                String MemStatus = "Premium";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                if (MemStatus == "Premium"){
                                    System.out.println("Your new total is $" + (Book2.BookCost - 5) + ".99");
                                    System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                                }
                            } else {
                                System.out.print("Your total is $" + Book2.BookCost + ".99");
                            }

                            


                        
                        }else if (answer == 1){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (Book2.BookCost - 2) + ".99");
                        } else if (answer == 2){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (Book2.BookCost - 5) + ".99");
                        }

                    }

                    if (Order == 3){
                        System.out.println("Your total is $" + Dvd1.DVDCost + ".99");
                        System.out.println("Please Select what member is making this purchase: ");
                        System.out.println("\t 1: Member: " + member1);
                        System.out.println("\t 2: Member: " + Premmember1);
                        System.out.println("\t 3: Skip");
                        System.out.println("\t 4: New Member!!!");
                        int answer = sc.nextInt();

                        if (answer == 4){
                            String name = sc.nextLine();
                            System.out.println("WOW a new member, lets get you signed up!!!");
                            System.out.println("Whats Your Name");
                            name = sc.nextLine();

                            System.out.println("What status would you like?");
                            System.out.println("\t 5: Regular");
                            System.out.println("\t 6: Premium");
                            int Answer = sc.nextInt();

                            if (Answer == 5){
                                String MemStatus = "Regular";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                System.out.println("Your new total is $" + (Dvd1.DVDCost - 2) + ".99");
                                System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                            } else if (Answer == 6){
                                String MemStatus = "Premium";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                if (MemStatus == "Premium"){
                                    System.out.println("Your new total is $" + (Dvd1.DVDCost - 5) + ".99");
                                    System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                                }
                            } else {
                                System.out.print("Your total is $" + Dvd1.DVDCost+ ".99");
                            }

                            


                        
                        }else if (answer == 1){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (Dvd1.DVDCost - 2) + ".99");
                        } else if (answer == 2){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (Dvd1.DVDCost - 5) + ".99");
                        }

                    }

                    if (Order == 4){
                        System.out.println("Your total is $" + Dvd2.DVDCost + ".99");
                        System.out.println("Please Select what member is making this purchase: ");
                        System.out.println("\t 1: Member: " + member1);
                        System.out.println("\t 2: Member: " + Premmember1);
                        System.out.println("\t 3: Skip");
                        System.out.println("\t 4: New Member!!!");
                        int answer = sc.nextInt();

                        if (answer == 4){
                            String name = sc.nextLine();
                            System.out.println("WOW a new member, lets get you signed up!!!");
                            System.out.println("Whats Your Name");
                            name = sc.nextLine();

                            System.out.println("What status would you like?");
                            System.out.println("\t 5: Regular");
                            System.out.println("\t 6: Premium");
                            int Answer = sc.nextInt();

                            if (Answer == 5){
                                String MemStatus = "Regular";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                System.out.println("Your new total is $" + (Dvd2.DVDCost  - 2) + ".99");
                                System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                            } else if (Answer == 6){
                                String MemStatus = "Premium";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                if (MemStatus == "Premium"){
                                    System.out.println("Your new total is $" + (Dvd2.DVDCost  - 5) + ".99");
                                    System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                                }
                            } else {
                                System.out.print("Your total is $" + Dvd2.DVDCost  + ".99");
                            }


                        }else if (answer == 1){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (Dvd2.DVDCost - 2) + ".99");
                        } else if (answer == 2){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (Dvd2.DVDCost - 5) + ".99");
                        }

                    }

                    if (Order == 5){
                        System.out.println("Your total is $" + cd1.CDCost + ".99");
                        System.out.println("Please Select what member is making this purchase: ");
                        System.out.println("\t 1: Member: " + member1);
                        System.out.println("\t 2: Member: " + Premmember1);
                        System.out.println("\t 3: Skip");
                        System.out.println("\t 4: New Member!!!");
                        int answer = sc.nextInt();

                        if (answer == 4){
                            String name = sc.nextLine();
                            System.out.println("WOW a new member, lets get you signed up!!!");
                            System.out.println("Whats Your Name");
                            name = sc.nextLine();

                            System.out.println("What status would you like?");
                            System.out.println("\t 5: Regular");
                            System.out.println("\t 6: Premium");
                            int Answer = sc.nextInt();

                            if (Answer == 5){
                                String MemStatus = "Regular";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                System.out.println("Your new total is $" + (cd1.CDCost - 2) + ".99");
                                System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                            } else if (Answer == 6){
                                String MemStatus = "Premium";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                if (MemStatus == "Premium"){
                                    System.out.println("Your new total is $" + (cd1.CDCost - 5) + ".99");
                                    System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                                }
                            } else {
                                System.out.print("Your total is $" + cd1.CDCost + ".99");
                            }

                            


                        
                        }else if (answer == 1){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (cd1.CDCost - 2) + ".99");
                        } else if (answer == 2){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (cd1.CDCost - 5) + ".99");
                        }

                    }

                    if (Order == 6){
                        System.out.println("Your total is $" + cd2.CDCost + ".99");
                        System.out.println("Please Select what member is making this purchase: ");
                        System.out.println("\t 1: Member: " + member1);
                        System.out.println("\t 2: Member: " + Premmember1);
                        System.out.println("\t 3: Skip");
                        System.out.println("\t 4: New Member!!!");
                        int answer = sc.nextInt();

                        if (answer == 4){
                            String name = sc.nextLine();
                            System.out.println("WOW a new member, lets get you signed up!!!");
                            System.out.println("Whats Your Name");
                            name = sc.nextLine();

                            System.out.println("What status would you like?");
                            System.out.println("\t 5: Regular");
                            System.out.println("\t 6: Premium");
                            int Answer = sc.nextInt();

                            if (Answer == 5){
                                String MemStatus = "Regular";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                System.out.println("Your new total is $" + (cd2.CDCost - 2) + ".99");
                                System.out.println("Hello " + member3);
                                System.out.println("Thanks for shopping.");
                            } else if (Answer == 6){
                                String MemStatus = "Premium";
                                Member member3 = new Member(name,  MemStatus, 34257869);
                                if (MemStatus == "Premium"){
                                    System.out.println("Your new total is $" + (cd2.CDCost - 5) + ".99");
                                    System.out.println("Hello " + member3);
                                    System.out.println("Thanks for shopping.");
                                }
                            } else {
                                System.out.print("Your total is $" + cd2.CDCost + ".99");
                            }

                            
                        
                        }else if (answer == 1){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (cd2.CDCost - 2) + ".99");
                        } else if (answer == 2){
                            System.out.println("welcome Back!!!");
                            System.out.println("Your new total is $" + (cd2.CDCost - 5) + ".99");
                        }

                    }


                    

                    System.out.println();

                    break;
                case 9:
                    System.out.println("Bye Bye!!!");
                    System.exit(1);
                    break;
                
            }

        }
        
    }
}
