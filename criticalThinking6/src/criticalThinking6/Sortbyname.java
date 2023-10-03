package criticalThinking6;

import java.lang.reflect.Field;
	import java.util.Comparator;

	class Sortbyname implements Comparator<Student> {
	    @Override
	    public int compare(Student a, Student b) {
	        try {
	            Field field = Student.class.getDeclaredField("name");
	            field.setAccessible(true);
	            String nameA = (String) field.get(a);
	            String nameB = (String) field.get(b);
	            return nameA.compareTo(nameB);
	        } catch (NoSuchFieldException | IllegalAccessException e) {
	            e.printStackTrace();
	            // Handle the exception as needed
	            return 0; // Default return value
	        }
	    }
	}
