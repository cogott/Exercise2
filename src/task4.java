public class task4 {
    public static void main(String[] args) {

        int Bricks;
        int containerCapacity;
        int totalContainers;

        Bricks = 85;
        containerCapacity = 6;

        //How many Containers will be full
        var quotient = (Bricks/containerCapacity);
        System.out.println("The number of full containers was:" + quotient);

        //Total Number of Containers.
        //I tried using if, but the result will always be the same since the values are constant. I
        totalContainers = Bricks/containerCapacity;
    if(totalContainers%Bricks == 0) {
        System.out.println(totalContainers + " is the total number of containers");
        }
    else {System.out.println((totalContainers + 1) + "is the total number of containers");

    }


    }

}
