package org.launchcode;

import java.lang.Math;

public class Temperatures {

    public static void main(String[] args) {


                String days[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
                String times[] = {"7 AM", "3 PM", "7 PM", "3 AM"};
                int sum3 = 0;
                int avg3;

                int temps[][] = new int[4][7];
                temps[0][0] = 68;
                temps[0][1] = 70;
                temps[0][2] = 76;
                temps[0][3] = 70;
                temps[0][4] = 68;
                temps[0][5] = 71;
                temps[0][6] = 75;
                temps[1][0] = 76;
                temps[1][1] = 76;
                temps[1][2] = 87;
                temps[1][3] = 84;
                temps[1][4] = 82;
                temps[1][5] = 75;
                temps[1][6] = 83;
                temps[2][0] = 73;
                temps[2][1] = 72;
                temps[2][2] = 81;
                temps[2][3] = 78;
                temps[2][4] = 76;
                temps[2][5] = 73;
                temps[2][6] = 77;
                temps[3][0] = 64;
                temps[3][1] = 65;
                temps[3][2] = 69;
                temps[3][3] = 68;
                temps[3][4] = 70;
                temps[3][5] = 74;
                temps[3][6] = 72;

                System.out.println("Temperature Calculator\n");
                System.out.println("The data provided are:");
                for (int timeOfDay = 0; timeOfDay < 4; timeOfDay++) {
                    if (timeOfDay > 0) {
                        System.out.println();
                    }

                    System.out.print(times[timeOfDay] + ": ");

                    for (int day = 0; day < 7; day++) {
                        System.out.print(temps[timeOfDay][day]);
                        if (day < 6) {
                            System.out.print(", ");
                        }
                    }
                }

                System.out.println("\n\nBased on that data, the following are the average temperatures for the week.\n");

                for (int day = 0; day < 7; day++) {
                    int sum1 = 0;
                    int avg1 = 0;
                    System.out.print(days[day] + ": ");

                    for (int timeOfDay = 0; timeOfDay < 4; timeOfDay++) {
                        sum1 += temps[timeOfDay][day];
                    }
                    avg1 = Math.round(sum1/4);
                    System.out.println(avg1);

                }

                System.out.print("\n\n");

                for (int time = 0; time < 4; time++) {
                    int sum2 = 0;
                    int avg2 = 0;
                    System.out.print(times[time] + ": ");

                    for (int day = 0; day < 7; day++){
                        sum2 += temps[time][day];
                    }
                    avg2 = Math.round(sum2/7);
                    System.out.println(avg2);
                }

                System.out.print("\n\nThe final average temperature for the week was:\n\nOverall: ");

                for (int timeOfDay = 0; timeOfDay < 4; timeOfDay++){
                    for (int day = 0; day < 7; day++){
                        sum3 += temps[timeOfDay][day];
                    }
                }
                avg3 = sum3/28;
                System.out.print(avg3);
            }
        }