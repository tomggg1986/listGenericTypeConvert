package utilities;

import java.util.List;
import java.util.stream.Collectors;

public class UpCast {
	@SuppressWarnings("unchecked")
	public static<T> List<T> cast(List<? super T> list,Class<T> type){		
		return list.stream()
				.filter(p -> p.getClass().equals(type))
				.map(m -> (T) m) 
				.collect(Collectors.toList());
	}
}
