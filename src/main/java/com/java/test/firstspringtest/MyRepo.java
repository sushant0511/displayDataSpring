package com.java.test.firstspringtest;

import org.springframework.data.jpa.repository.*;
public interface MyRepo extends JpaRepository<Product,Long>  
{

}
