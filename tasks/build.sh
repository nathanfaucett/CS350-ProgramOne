if [ ! -d "./build" ]; then
  mkdir ./build
fi

javac ./PG1NBF/BoundedBuffer.java -cp "./build" -d ./build
javac ./PG1NBF/Producer.java -cp "./build" -d ./build
javac ./PG1NBF/Consumer.java -cp "./build" -d ./build
javac ./PG1NBF/Server.java -cp "./build" -d ./build
