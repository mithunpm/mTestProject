import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollectionApi {

	public static void main(String[] args) {
		System.out.println("test");
		List<Integer> list=new ArrayList<Integer>();
		for (int i=0;i<10;i++)
		{
			list.add(i);
		}
		long l=list.stream().filter(i-> i==4).count();
		System.out.println(l);
		list=list.stream().filter(i-> i>5).collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("dateeeeeeeee");
		
		LocalDate date=LocalDate.of(1988,Month.MAY,2);
		System.out.println(date);
		System.out.println(date.compareTo(LocalDate.now()));
		LocalTime time=LocalTime.now();
		System.out.println(time);
	}

}
