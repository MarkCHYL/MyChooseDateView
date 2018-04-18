package com.view.demo.mychoosedateview.widget;

/**
 * The simple Array wheel adapter
 * @param <T> the element type
 */
/**
 * Description:日期选择器适配器
 * Blog: www.qiuchengjia.cn
 * Data: 2017/6/8 0:01
 * @author: qiu
 */
public class ArrayWheelAdapter<T> implements WheelAdapter {
	
	/** The default items length */
	public static final int DEFAULT_LENGTH = -1;
	
	// items
	private T items[];
	// length
	private int length;

	/**
	 * Constructor
	 * @param items the items
	 * @param length the max items length
	 */
	public ArrayWheelAdapter(T items[], int length) {
		this.items = items;
		this.length = length;
	}
	
	/**
	 * Contructor
	 * @param items the items
	 */
	public ArrayWheelAdapter(T items[]) {
		this(items, DEFAULT_LENGTH);
	}

	@Override
	public String getItem(int index) {
		if (index >= 0 && index < items.length) {
			return items[index].toString();
		}
		return null;
	}

	@Override
	public int getItemsCount() {
		return items.length;
	}

	@Override
	public int getMaximumLength() {
		return length;
	}

}
