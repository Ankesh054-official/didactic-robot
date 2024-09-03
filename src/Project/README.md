Problem Statement: Write a program that simulates a simple food ordering system.

1. we need a predefined menu, with items and price list.

2. The user should be able to view a predefined menu with items and their prices,

3. place an order by selecting items from the menu,

4.  view the order summary including the total cost.

5. The program should continue until the user selects the exit option.


Menu Options:

Choose Cuisine (e.g., Indian, Italian, Chinese)
View Dishes in Selected Cuisine
Place an Order
View Order Summary
Exit

Flow:

1. Ask to select cuisine

2. Ask to select dises according to cuisine.
3. select dises.
4. selected dishes get stored in a DS with price
5. price calculation and summary prepration
6. place order
7. view order summary
8. Ask if user wants to Exit. repeat from step 1 if NO.


predefined cuisine

Predefined dises



functions:
DisplayCuisine
DisplayDises(cuisine)
summaryPrepration(listofselectedDishes)
place