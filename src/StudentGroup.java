import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here

		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
            throw new IllegalArgumentException();
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=Student.length)
            throw new IllegalArgumentException();
        else
            return students;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException();
        else if(index<0 || index>=Student.length)
            throw new IllegalArgumentException();
        else
            students.set(index,student);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException();
        else
            students.add(0,student);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException();
        else
        {
            int n=(Student.length)-1;
            students.add(n,student);
        }
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException();
        else if(index<0 || index>=Student.length)
            throw new IllegalArgumentException();
        else
            students.add(index,student);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException();
        else if(index<0 || index>=Student.length)
            throw new IllegalArgumentException();
        else
            students.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException();
        else
        {
            int c=0;
            for(int i=0;i<Student.length;i++)
            {
                if(Student[i]==student)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                throw new IllegalArgumentException("Student not exist");
            }
            else
                ArrayUtils.removeElement(Student,student);
        }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=Student.length)
            throw new IllegalArgumentException();
        else
        {
            for(i=index+1;i<Student.length;i++)
            students.remove(i);
        }
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException();
        else
        {
            for(int i=0;i<Student.length;i++)
            {
                if(Student[i]==student)
                {
                    //c++;
                    break;
                }
            }
            for(int j=i+1;j<Student.length;j++)
                students.remove(j);
        }
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=Student.length)
            throw new IllegalArgumentException();
        else
        {
            for(i=0;i<index;i++)
            students.remove(i);
        }
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException();
        else
        {
            for(int i=0;i<Student.length;i++)
            {
                if(Student[i]==student)
                {
                    //c++;
                    break;
                }
            }
            for(int j=0;j<i;j++)
                students.remove(j);
        }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int n=Student.length;
		for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(Student[j]>Student[j+1])
                {
                    int temp;
                    temp=Student[j];
                    Student[j]=Student[j+1];
                    Student[j+1]=temp;
                }
            }
        }
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null)
            throw new IllegalArgumentException();
        else
        {
            Student s;
            for(int i=0;i<Student.length;i++){
            Date d=s.getBirthDate();
            if(d.before(date))
                return(Student[i]);
        }
        }
		//return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null || lastDate==null)
            throw new IllegalArgumentException();
        else
        {
            Student s;
            for(int i=0;i<Student.length;i++){
            Date d=s.getBirthDate();
            if(d.after(date) && (d.before(date)))
                return(Student[i]);
        }
        }
		//return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		//return null;
		if(student==null)
            throw new IllegalArgumentException();
        else
        {
            for(int i=0;i<Student.length;i++)
            {
                if(Student[i]==student)
                {
                    //c++;
                    break;
                }
            }
            return(Student[i+1]);
        }
	}
}
