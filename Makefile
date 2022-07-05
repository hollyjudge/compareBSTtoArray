# Makefile for Assignment 1
# author: Hussein Suleman
# appended for this assignment by Holly Judge

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=Experiment.class BinaryTreeNode.class BTQueueNode.class BTQueue.class BinaryTree.class BinarySearchTree.class AccessArrayApp.class Students.class AccessBSTApp.class
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)
clean:
	rm $(BINDIR)/*.class

run: $(CLASS_FILES)
	java -cp $(BINDIR) AccessArrayApp
runBST: $(CLASS_FILE)
	java -cp $(BINDIR) AccessBSTApp
	
cleandocs:
	rm -r doc/*
docs:
	javadoc -classpath $(BINDIR) -d /src/doc/*.java	
