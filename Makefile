JAVADIR=.
JARNAME=db-api

CLASSPATH_DO= export CLASSPATH=$(PWD)/db-api.jar:$(PWD)/postgresql-9.4.1208.jre6.jar

all:
	($(CLASSPATH_DO); cd src; javac -encoding UTF-8 `find . -name \*.java`)
	($(CLASSPATH_DO); cd src; jar cvf ../$(JARNAME).jar `find . -name \*.class -o -name \*.java`)
clean:
	$(RM) $(JARNAME).jar `find . -name \*.class`

install:
	/bin/cp $(JARNAME).jar $(JAVADIR)