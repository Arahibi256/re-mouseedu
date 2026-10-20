package hanjogovernment.mouseedu.re_mouseedu.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ChamberMapper {
  @Select("SELECT * FROM chamber WHERE id = #{id}")
  Chamber selectById(int id);
}
