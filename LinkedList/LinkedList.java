package LinkedList;

public class LinkedList {
//    这里测试
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Node  first =new Node(1,"我是第一个node");
          Node  sec =new Node(2,"我是第二个node");
		LinkededList linkededList =new LinkededList();
		linkededList.addreal(first);
		linkededList.addreal(sec);
		linkededList.showLinkedList();
	}

}
//这是链表，把节点管理起来，使成为一个链表
class LinkededList{
//链表可以有无头结点
//	头结点是不带数据的
	Node head = new  Node(0, "");
	
//	以添加到尾部的方式
	
	public void addreal(Node i){

		
//		想一下是不是要遍历链表才能添加结点到尾部，条件为null
		
//		那么遍历是不是要有一个辅助的结点，才能遍历到尾部
		
//		我们不能将头结点来遍历，这样会使head结点的位置发生变化
		Node temp =head;
		while(true){
			if(temp.next == null){
				break;
			}
			temp=temp.next;
		}
	    temp.next=i;
	}
	
//	显示链表
	public void showLinkedList(){
		Node temp =head;
//		还要判断 链表是否为空，空的话不向下执行
		 if(temp.next==null){
			 return;
		 }
				
//		要显示链表肯定要遍历	
		while(true){
			if(temp.next == null){
				break;
			}
			temp=temp.next;
			System.out.println(temp.toString());
		}
	}
	
}

//这是链表的节点
class Node{
	Node next;
	int id;
	String name;
	public Node(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Node [" + " id=" + id + ", name=" + name + "]";
	}
	
//	为了显示方便重写toString 方法
	
}