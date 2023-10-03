package criticalThinking6;

import java.util.Comparator;

class Sortbyroll implements Comparator<Student>

{

// Used for sorting in ascending order of

// roll number

public int compare(Student a, Student b)

{

return a.rollno - b.rollno;

}

}
