fun main()
{
    while(true)
    {
        println("Enter your number or type exit:")
        val input = readln().lowercase()

        if(input=="exit")
        {
            println("You exited successfully!")
            break
        }

        val number = input.toIntOrNull()
        if (number != null)
        {
            if (number % 2 == 0)
            {
                println("$number is an even number")
            } else
            {
                println("$number is an odd number")
            }
        }
        else
        {
            println("Enter valid number")
        }
    }

}
