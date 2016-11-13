        /* Declare second integer, double, and String variables. */
        int secInt = 0;
        double secDou = 0.0;
        String secStr = "";

        /* Read and save an integer, double, and String to your variables.*/
        secInt = scan.nextInt();
        secDou = scan.nextDouble();
        scan.nextLine();
        secStr = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + secDou);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + secStr);
