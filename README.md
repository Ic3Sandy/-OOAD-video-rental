# OOAD

## Video Rental Store

### Document of program at [Document.pdf](https://github.com/Ic3Sandy/OOAD-video-rental/blob/dev/Document.pdf)

### Nakorn Vatjanasatit, Chitrathep Chitranuwatkul

* Problem Domain: Video Rental Store

    For this homework, you will analyze and design an object-oriented program to model the following problem domain. (Note: see clarifications at the end of this post, for additional details on the problem domain and the program you need to implement.)

    A video rental store has a catalog of 20 different videos to rent, spread across 5 different categories (New Release, Drama, Comedy, Romance, and Horror). Each video has a unique name and belongs to a specific category; the price per day to rent a video varies by category. New Release is, for example, the most expensive category. Comedy is the cheapest category.

    Customers are allowed to rent a video for up to 7 nights. (Thus a video rented for 7 nights on a Monday must be returned by the following Monday. A video rented for “one day” would, for example, be rented on a Tuesday and returned the next morning before the video store opens for business on Wednesday.) Customers are allowed to have at most three videos rented at any one time.

    This store has 10 customers; each customer has a unique name and is associated with one of three types. Breezy customers rent one or two videos for one or two nights. Hoarders always rent three videos for seven nights. Regular customers will rent one to three videos each time they visit for 3 to 5 nights.

    Each time a customer comes into the store, a Rental is created that will keep track of what videos they rented and how many nights they will keep the videos. A customer rents the “group” of videos and returns them all at the same time. They will NOT, for example, rent three videos and then return one after 2 days, the second after 5 days, and the third after seven days. They will instead return all of the videos they rented at the specified time. (That means, for instance, that a customer will never be late in returning their videos.)

    The store keeps track of the existing rentals along with the current inventory of the store. As such, when it has zero rentals,there will be 20 videos in its inventory. When it has zero videos in its inventory, it will have multiple rentals that between them account for all 20 videos.

    Finally, a customer pays up front for their rental. If, for example, a customer rents three Horror videos for three nights at a price of $3 per night, they will pay the store $27 dollars before they leave the store with their three videos.

* Clarifications

    A customer can have more than one active rental. That is, they can show up on day 1 and rent 1 video for 5 nights. They can then show up on day 2 and rent another video for 4 nights. As long as they do not have more than 3 videos rented, they are allowed to have multiple rentals.

    Returns occur at the beginning of the day before the store opens for business. A video rented for one night is available to customers the very next day; that’s because the customer rented the video for one night, watched it, and got it back to the store early the next morning.

    Your program should be single-threaded; you do not need to handle the case of multiple customers trying to rent videos concurrently.

* Assignment

    Write an object-oriented program that implements the above problem domain and does the following:

  * Simulates the activity of the video store for 35 days (34 nights). On each day, a random number of customers will visit the store as long as there are videos to rent. Each customer will create one Rental that follows the rules of their associated type before they leave the store. That is, no customer will show up and then leave without making a rental. Note: if the store has less than 3 videos, then a Hoarder will NOT arrive (as they wouldn’t be able to create a Rental that follows their rules). As soon as the store has zero videos, customers will magically stop arriving until videos are once again available.

  * At the end of the simluation, the program will produce a report that includes the following information:

    the number of videos currently in the store along with a list of their names

    the amount of money the store made during the 35 days (including any rentals that occured on the 35th day)

    a list of all the completed rentals including which movies were rented by which customer for how many days along with the total amount of that rental

    a list of all the active rentals that includes all of the information listed in the previous bullet

* Objectives

    The purpose of this assignment is NOT to meet the requirements above by any means necessary. A program that does the simulation above and produces the requested report but makes use of structured programming techniques (i.e. no objects, just data structures and a main program) will receive zero points (for the whole assignment). An object-oriented program that meets the requirements but doesn’t make use of polymorphism, has poor abstractions, and poor encapsulation will lose most of the points allocated to the program. Only object-oriented programs that show good use of abstraction, encapsulation and polymorphism and meet the above requirements will be able to get full credit for the program.

* Submission

    Part I: A pdf file of use cases for the program due February 25, 2018 by midnight.

    Part II: An archive (i.e. a zip archive or compressed tar file) containing the source code for your program and a PDF document that describes your program and its design and that provides instructions on how to compile it and run it. The PDF document will also contain a UML class diagram that shows the classes that make up your program and the relationships that exist between them. This part is done in group and due March 4, 2018 by midnight.