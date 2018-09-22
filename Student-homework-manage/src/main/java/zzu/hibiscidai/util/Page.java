package zzu.hibiscidai.util;

public class Page {
	// 页号
	private int pageIndex;
	// 每一页显示多少条
	private int pageSize;
	// 总条数 来源于数据库 count(*)
	private int totalCount;
	// 总页数 = totalCount|pageSize关系
	private int pageCount;

	public Page() {
		this.pageSize = 3;
	}

	public Page(int pageIndex) {
		this(pageIndex, 3);
	}

	public Page(int pageIndex, int pageSize) {
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	/*
	 * 设置totalCount、pageCount totalCount:进行数据库操作 DAO得到的count(*) pageCount:总页数
	 * 设计目的：totalCount -----> pageCount
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		this.pageCount = (totalCount % pageSize == 0) ? totalCount / pageSize : totalCount / pageSize + 1;
	}

	public int getPageCount() {
		return pageCount;
	}

	/*
	 * public void setPageCount(int pageCount) { this.pageCount = pageCount; }
	 */

	// 起始行与结束行，用于sql语句 限定查询哪些行
	public int getFirstResult() {
		return (pageIndex - 1) * pageSize + 1;
	}

	public int getLastResult() {
		return pageIndex * pageSize;
	}

	// 是否有上、下一页
	public boolean getHasNextPage() {
		return pageIndex < pageCount;
	}

	public boolean getHasPrivousPage() {
		return pageIndex > 1;
	}

	@Override
	public String toString() {
		return "Page [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount + ", pageCount=" + pageCount + "]";
	}

}