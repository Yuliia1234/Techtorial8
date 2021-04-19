package Project;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {

        String userCategory, musicCategoryOne, musicCategoryTwo, musicCategoryThree;
                String userSong, songOne, songTwo, songThree, songFour, songFive;
                float categoryPriceOne = 3;
                float categoryPriceTwo = 4;
                float categoryPriceThree = 2;
                float balance;
                Scanner input = new Scanner(System.in);
                musicCategoryOne = "Classical";
                musicCategoryTwo = "Pop";
                musicCategoryThree = "Country";
                System.out.println(musicCategoryOne);
                System.out.println(musicCategoryTwo);
                System.out.println(musicCategoryThree);
                System.out.println("Please select a category: ");
                userCategory = input.nextLine();
                if (userCategory.equalsIgnoreCase(musicCategoryOne))
                {
                    songOne = "Four Seasons";
                    songTwo = "Fur Elise";
                    songThree ="Finlandia" ;
                    songFour ="Vocalise";
                    songFive = "The Planets";
                    System.out.println(songOne);
                    System.out.println(songTwo);
                    System.out.println(songThree);
                    System.out.println(songFour);
                    System.out.println(songFive);
                    System.out.println("Which one would you like to listen?");
                    userSong = input.nextLine();
                    if (userSong.equalsIgnoreCase(songOne))
                    {
                        System.out.println("Please enter $" +categoryPriceOne +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceOne)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceOne)
                        {
                            System.out.println(songOne +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceOne;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songOne +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songTwo))
                    {
                        System.out.println("Please enter $" +categoryPriceOne +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceOne)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceOne)
                        {
                            System.out.println(songTwo +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceOne;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songTwo +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songThree))
                    {
                        System.out.println("Please enter $" +categoryPriceOne +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceOne)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceOne)
                        {
                            System.out.println(songThree +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceOne;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songThree +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songFour))
                    {
                        System.out.println("Please enter $" +categoryPriceOne +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceOne)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceOne)
                        {
                            System.out.println(songFour +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceOne;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songFour +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songFive))
                    {
                        System.out.println("Please enter $" +categoryPriceOne +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceOne)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceOne)
                        {
                            System.out.println(songFive +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceOne;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songFive +"is playing. Enjoy the music!");
                        }
                    }
                    else
                    {
                        System.out.println(userSong + "is not available.");
                    }
                }
                else if (userCategory.equalsIgnoreCase(musicCategoryTwo))
                {
                    songOne = "Bad Guy";
                    songTwo = "Talk";
                    songThree ="Please me" ;
                    songFour ="7 Ring";
                    songFive = "Ring My Bells";
                    System.out.println(songOne);
                    System.out.println(songTwo);
                    System.out.println(songThree);
                    System.out.println(songFour);
                    System.out.println(songFive);
                    System.out.println("Which one would you like to listen?");
                    userSong = input.nextLine();
                    if (userSong.equalsIgnoreCase(songOne))
                    {
                        System.out.println("Please enter $" +categoryPriceTwo +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceTwo)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceTwo)
                        {
                            System.out.println(songOne +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceTwo;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songOne +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songTwo))
                    {
                        System.out.println("Please enter $" +categoryPriceTwo +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceTwo)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceTwo)
                        {
                            System.out.println(songTwo +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceTwo;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songTwo +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songThree))
                    {
                        System.out.println("Please enter $" +categoryPriceTwo +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceTwo)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceTwo)
                        {
                            System.out.println(songThree +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceTwo;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songThree +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songFour))
                    {
                        System.out.println("Please enter $" +categoryPriceTwo +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceTwo)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceTwo)
                        {
                            System.out.println(songFour +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceTwo;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songFour +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songFive))
                    {
                        System.out.println("Please enter $" +categoryPriceTwo +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceTwo)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceTwo)
                        {
                            System.out.println(songFive +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceTwo;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songFive +"is playing. Enjoy the music!");
                        }
                    }
                    else
                    {
                        System.out.println(userSong + "is not available.");
                    }
                }
                else if (userCategory.equalsIgnoreCase(musicCategoryThree))
                {
                    songOne = "Meant To Be";
                    songTwo = "Heaven";
                    songThree ="Simple" ;
                    songFour ="One Number Away";
                    songFive = "Old Town Road";
                    System.out.println(songOne);
                    System.out.println(songTwo);
                    System.out.println(songThree);
                    System.out.println(songFour);
                    System.out.println(songFive);
                    System.out.println("Which one would you like to listen?");
                    userSong = input.nextLine();
                    if (userSong.equalsIgnoreCase(songOne))
                    {
                        System.out.println("Please enter $" +categoryPriceThree +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceThree)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceThree)
                        {
                            System.out.println(songOne +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceThree;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songOne +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songTwo))
                    {
                        System.out.println("Please enter $" +categoryPriceThree +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceThree)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceThree)
                        {
                            System.out.println(songTwo +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceThree;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songTwo +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songThree))
                    {
                        System.out.println("Please enter $" +categoryPriceThree +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceThree)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceThree)
                        {
                            System.out.println(songThree +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceThree;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songThree +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songFour))
                    {
                        System.out.println("Please enter $" +categoryPriceThree +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceThree)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceThree)
                        {
                            System.out.println(songFour +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceThree;
                            System.out.println("You have entered $" +change +"more. Please wait for change.");
                            System.out.println(songFour +"is playing. Enjoy the music!");
                        }
                    }
                    else if (userSong.equalsIgnoreCase(songFive))
                    {
                        System.out.println("Please enter $" +categoryPriceThree +" for this song: ");
                        balance = input.nextFloat();
                        if (balance < categoryPriceThree)
                        {
                            System.out.println("$"+balance +" is not enough, ");
                            System.out.println("Please try later.");
                        }
                        else if (balance == categoryPriceThree)
                        {
                            System.out.println(songFive +" is playing. Enjoy the music!");
                        }
                        else
                        {
                            float change = balance - categoryPriceThree;
                            System.out.println("You have entered $" +change +" more. Please wait for change.");
                            System.out.println(songFive +"is playing. Enjoy the music!");
                        }
                    }
                    else
                    {
                        System.out.println(userSong + "is not available.");
                    }
                }
                else
                {
                    System.out.println(userCategory + "is not available");
                }
            }
        }







