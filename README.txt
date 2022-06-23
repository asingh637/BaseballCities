project folder:
asingh637-cs1c-project08/


Brief description of submitted files:

src/shortestPath/BaseballFileReader.java
    - Reads and parses CSV file to be read by program
    - Generates ArrayList of Connection objects
    - Contains readFile() method to read filepath of specified cities and distances
src/shortestPath/Connection.java
    - Used to assist in determining the path/connection between two cities
src/shortestPath/FHgraph.java
    - Contains classes FHedge, FHgraph, FHvertex
    - Used to create and implement the dijkstra method and algorithm
    - Finds the shortest distance between a starting and destination city
src/shortestPath/Pair.java
    - Used to create pair data structure
src/shortestPath/RouteFinder.java
    - Contains main() for testing
    - Reads the file provided of cities and destinations
    - Customizable start/destination and cities to avoid

resources/BaseballCitiesEdgeCosts.txt
    - Text file including the cities and the associated costs (distance) between each of them
resources/Observations.txt
    - Text file documenting my observations and comments on the results
resources/RUN.txt
RUN.txt
    - console output of RouteFinder.java
README.txt
    - description of submitted files

