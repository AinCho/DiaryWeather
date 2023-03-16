package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {
//jdbc와는 다르게 save, find 함수가 다 포함되어 있기때문에, 따로 작성할 필요없음
}
