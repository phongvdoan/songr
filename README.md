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

Run ./gradlew run

In browser, type localhost.com/8080

type localhost.com/8080/hello

type localhost.com/8080/capitalize/<insert words>

type localhost.com/8080/albums


# Spring and REST

## Collaborators:  Phong

### Problem Domain

Update your Album model so that it can be saved in a database.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
A user should be able to see information about all the albums on the site.
A user should be able to add albums to the site.

### Solution

Add dependencies, and added a AlbumRepository Interface.

## To Run

psql

Create Database albums

Run ./gradlew run

In browser, type localhost.com/8080

type localhost.com/8080/hello

type localhost.com/8080/capitalize/<insert words>

type localhost.com/8080/albums

# Related Resources and Integration Testing

## Collaborators:  Phong

### Problem Domain

A user should be able to see information about all the songs on the site.
A user should be able to view a page with data about one particular album.
A user should be able to add songs to an album.
A user should be able to see the songs that belong to an album when looking at that album.

### Solution

Added Song, SongRepository Class with a ManytoOne relationship to Album that has a oneToMany.

## To Run

psql

Create Database albums

Run ./gradlew run

In browser, type localhost.com/8080

type localhost.com/8080/hello

type localhost.com/8080/capitalize/<insert words>

type localhost.com/8080/albums