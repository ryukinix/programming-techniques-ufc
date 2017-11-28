javac exemplos/*.java && \
jar -cfe Main.jar exemplos.Main exemplos/*.class
java -jar Main.jar
