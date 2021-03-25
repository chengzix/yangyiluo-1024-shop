package net.xdclass.mapper;

import net.xdclass.model.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ORANGE
 * @since 2021-03-25
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
