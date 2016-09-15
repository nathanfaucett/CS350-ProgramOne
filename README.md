CS 350-01 (Fall 2016: KP)
=====
##Programming Assignment 1
###Due: 22nd September (By 11:00 AM)

Consider the shared memory version of the producer/consumer problem. Your task in this assignment is to create a multithreaded program to do the following: the Server class should create two producer threads identified as “John” and “Liz”; it should create two consumer threads identified as “Mary” and “Bert”; John & Mary share a buffer; Liz & Bert share a different buffer.

A producer thread repeats the following steps forever: sleep for a random amount of time (1 to 7 seconds) and then generate a non-negative random integer value in the range 4000…60000; then deposit this value into the buffer. The corresponding consumer thread repeats the following steps forever: pick up a value from the buffer; determine if the value is a prime number or not; output both the number & its prime-status to the screen. Thus, in your producer/consumer problem, whatever “John” produces “Mary” consumes & whatever “Liz” produces “Bert” consumes.

For your convenience I have provided you the solution given by the authors of our textbook for the producer/consumer problem based on shared buffer which you may edit/modify to do this assignment. (See the folder PG1xxx). Note that this folder includes the following files: Server.java, Producer.java, Consumer.java, & BoundedBuffer.java. You will rename the folder PG1xxx replacing xxx with your initials.  Each file must include your name, course info, assignment #, date, and a brief description of the task done in that file.

###NOTE:
1. Your Java source files should be well-commented & well-structured
2. You must include your name, current date, & a description of the problem as comments
3. Electronic copy of the folder PG1xxx (zipped) must be posted by due date time to the appropriate location on the blackboard. Post only the .zip type file.
4. You need to turn in a hardcopy of the source files (Server.java, Producer.java, BoundedBuffer.java, and Consumer.java) by the due date time
