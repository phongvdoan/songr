# Building Full-Stack Web Apps

## Collaborators:  Phong

### Problem Domain

Ensure that you can run the Spring app.
Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.
Create an Album class to act as a model in our app.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)

### Solution

Initialize the Spring app and create a controller class to control routes. Add the routes and create a template within the resources directory. 

## To Run

Run the main method 
In browser, type localhost.com/8080
type localhost.com/8080/hello
type localhost.com/8080/capitalize/<insert words>
type localhost.com/8080/albums

