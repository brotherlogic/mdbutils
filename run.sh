mvn -q clean compile exec:java -Dexec.args="simon 12" | mail -s "[STOCK - 12]" s.tucker@dcs.shef.ac.uk
mvn -q clean compile exec:java -Dexec.args="simon CD" | mail -s "[STOCK - CD]" s.tucker@dcs.shef.ac.uk
mvn -q clean compile exec:java -Dexec.args="simon 7" | mail -s "[STOCK - 7]" s.tucker@dcs.shef.ac.uk
mvn -q clean compile exec:java -Dexec.args="jeanette 12" | mail -s "[STOCK - 12]" jeanette@brotherlogic.co.uk
mvn -q clean compile exec:java -Dexec.args="jeanette CD" | mail -s "[STOCK - CD]" jeanette@brotherlogic.co.uk
mvn -q clean compile exec:java -Dexec.args="jeanette 7" | mail -s "[STOCK - 7]" jeanette@brotherlogic.co.uk