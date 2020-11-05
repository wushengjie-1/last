package com.qfedu.cartprovider.dao;

import com.qfedu.common.dto.CartAddDto;
import com.qfedu.common.dto.CartDelDto;
import com.qfedu.common.dto.CartItem;
import com.qfedu.entity.CartAdd;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface CartAddDao {
    //添加购物车
    int CartAdd();

    //查询是否加入购物车
    @Select("select * from t_cart where uid = #{uid} and skuid = #{skuid}")
    CartAdd queryByUid(CartAddDto dto);

    //加入购物车
    @Insert("insert into t_cart (skuid,uid,scount,jprice,ctime) values(#{skuid},#{uid},#{scount},#{jprice},now()")
    int insertCart(CartAddDto dto);
    //修改购物车
    @Update("update t_cart set skuid = #{skuid},uid = #{uid},scount = scount + #{scount},jprice = #{jprice}")
    int updateCart(CartAddDto dto);
    //清空购物车
    @Delete("delete from t_cart where id = #{id}")
    int delById(int id);

    //添加数量
    @Update("update t_cart set scount = scount + #{count} where id = #{id}")
    int updateById(CartItem dto);

    //查询所有
    @Select("select * from t_cart where uid = #{uid}")
    List<CartAdd> queryByUidAll(int uid);
}
