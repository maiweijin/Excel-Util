package com.bonade.util.excel;

import java.io.File;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.function.Function;

import com.bonade.util.excel.ExcelObject.ExcelType;

public interface ExcelHelper<T> {
	public void addColumn(String title, Serializable method);

	public void addColumn(String title, Function<T, String> function);

	public void createExcel(File file, List<T> data);

	public void createExcel(OutputStream out, List<T> data, ExcelType excelType);

	public T getModel(T t);
}
