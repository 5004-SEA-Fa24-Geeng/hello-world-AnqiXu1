# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].

```mermaid
---
title: Aloha World UML
---
classDiagram
    direction LR
    AlohaWorld --> Greeter : has-a
    AlohaWorld --> ConsoleView : uses
    ConsoleView --> Greeter : uses
    Greeter --> Greeting : has-a

    class AlohaWorld {
        - Greeter greeter
        - ConsoleView consoleView
        + main(String[] args)
        + start()
    }

    class Greeter {
        - List~Greeting~ greetings
        + Greeter(List~Greeting~ greetings)
        + String getGreeting(String name, int localityID)
        + String getDefaultGreeting()
    }

    class ConsoleView {
        + void displayMessage(String message)
        + String getInput()
    }

    class Greeting {
        - int localityID
        - String localityName
        - String asciiGreeting
        - String unicodeGreeting
        - String formatStr
        + Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr)
        + int getLocalityID()
        + String getAsciiGreeting()
        + String getUnicodeGreeting()
        + String formatGreeting(String name, boolean asciiOnly)
    }


### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).
The program starts from the main method in AlohaWorld. It takes in input from the client, and greets them with different greetings. ConsoleView handles user input and displays output. It asks the client to select a locality by number. If they select an invalid number, it will continue to ask them until they select a valid number Then, it asks the client if they would like to be greeted again.
Greeter holds the name of the person, and the locality of greeting to be used. It is meant to be a simple class that acts as a container for the information, along with generating the proper greeting.

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * (example) `final class`
   * locality < 1 || locality > localityList.size()
   * .trim()
   * System.out.println()

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    * List.size() method returns the count of elements present in this list [^3].
    * trim method remove white space from both ends of a string. It won't change the original string [^4].
    * System.out.println() is used to print an argument that is passed to it [^5].
    
3. What does `main` do in Java? 

    It is the starting point. It will be called first when run a program.

4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    It is used to return a string representation of an object. Usually override this method to return a string. It is useful for debugging.

5. What is javadoc style commenting? What is it used for? 

    It is the conventional of commenting in Java. Such as /** / @param @return etc. It is used for creating expalantion document and help readers to under stand the code.

6. Describe Test Driving Development (TDD) in your own words. 

    TDD is a process that tests are written before the code. Developer will try to make the test pass and therefore can help us to focus on the functionality.

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?
    Firstly, with ConsoleView solely responsible for handling input and output, it won't affect the main part of a project. Second, if we need to do some further design of the inter face, it will be easiler and clearer to do so. Third, it is more professinal to make the program modular and has single responsibility per isolating part.

2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.
    To make the application more dynamic, we can add external resources of different language greetings. With the external souce or database, we don't need to modify the core logic of the program in greeter anymore.


> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.

[^3]: List size() method in Java. https://www.geeksforgeeks.org/list-size-method-in-java-with-examples/. Accessed: 2025-01-26

[^4]: Java String trim() Method. https://www.w3schools.com/java/ref_string_trim.asp. Accessed: 2025-01-26

[^5]: System.out.println in Java. https://www.geeksforgeeks.org/system-out-println-in-java/. Accessed: 2025-01-26

<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java