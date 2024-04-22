package com.ncsgroup.profiling.service.base;

import java.util.List;

public interface BaseService<T> {
  T create(T t);

  T update(T t);

  void delete(Integer id);

  T get(Integer id);

  List<T> list();
}
