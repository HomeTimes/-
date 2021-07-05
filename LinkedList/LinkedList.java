package LinkedList;

public class LinkedList {
//    �������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Node  first =new Node(1,"���ǵ�һ��node");
          Node  sec =new Node(2,"���ǵڶ���node");
          Node  three =new Node(3,"���ǵ�3��node");
          
		LinkededList linkededList =new LinkededList();
//		linkededList.addreal(first);
//		linkededList.addreal(three);
//		linkededList.addSort(three);
		linkededList.updateNode(three);
		linkededList.showLinkedList();
	}

}
//���������ѽڵ����������ʹ��Ϊһ������
class LinkededList{
//�����������ͷ���
//	ͷ����ǲ������ݵ�
	Node head = new  Node(0, "");
	
//	����ӵ�β���ķ�ʽ
	
	public void addreal(Node i){

//		��һ���ǲ���Ҫ�������������ӽ�㵽β��������Ϊnull
//		��ô�����ǲ���Ҫ��һ�������Ľ�㣬���ܱ�����β��
//		���ǲ��ܽ�ͷ�����������������ʹhead����λ�÷����仯
		Node temp =head;
		while(true){
			if(temp.next == null){
				break;
			}
			temp=temp.next;
		}
	    temp.next=i;
	}
//	���ǲ��������ͬһ��Ԫ�ص����
     public void addSort(Node i){
    	 Node temp =head;
    	 if(temp.next == null ){
    		 temp.next = i;
    		 return;
    	 }
//    	 ������ǣ���ʾ���ĸ�λ�ò�������
    	 boolean flag = false;
    	 
//    	 �׽�㲻Ϊ��
    	 while(true){
//    		 �ҵ����һ��û�ҵ����ʵ�λ��
    		 if(temp.next== null){
    			 break;
    		 }
//    		�ҵ�ָ��λ����
    		 if(temp.next.id > i.id){
    			break;
    		 }else if(temp.next.id == i.id){
    			 flag = true;
    		 }
    		 temp = temp.next;
    	 }
    	 
    	 if(flag){
    		 System.out.println("�����Ѵ���");
    	 }else{
    		 i.next = temp.next;
    		 temp.next = i; 
    	 }
    	 
     }
	//	��ʾ����
	public void showLinkedList(){
		Node temp =head;
//		��Ҫ�ж� �����Ƿ�Ϊ�գ��յĻ�������ִ��
		 if(temp.next==null){
			 return;
		 }
				
//		Ҫ��ʾ����϶�Ҫ����	
		while(true){
			if(temp.next == null){
				break;
			}
			temp=temp.next;
			System.out.println(temp.toString());
		}
	}
//	����ָ���ڵ���Ϣ
	public void updateNode(Node i){
		Node temp =head;
//		�ж��Ƿ�Ϊ�գ���Ҫ�ȿ�ʼ�ͱ��������ù�
		if(temp.next == null){
			System.out.println("����û��Ԫ��");
			return;
		}
//		������ָ���Ľڵ�
//		����ڵ���ڣ�����
		boolean flag = false;
		while(true){
//			�нڵ�Ԫ�أ�һֱ�Ұ��ң����Ҳ���
			if(temp.next ==null){
                   break;
			}
//			�ҵ���
			if(temp.next.id == i.id){
				flag = true;
				break;
			}
			temp = temp.next;
		}
		 if(flag){
			 i.next = temp.next.next;
			 temp.next=i;   		 
		 }else{
			 System.out.println("������û���ҵ�Ԫ��");
		 }
	}
}

//��������Ľڵ�
class Node{
	Node next;
	int id;
	String name;
	public Node(int id,String name){
		this.id=id;
		this.name=name;
		
	}
//	Ϊ����ʾ������дtoString ����
	@Override
	public String toString() {
		return "Node [" + " id=" + id + ", name=" + name + "]";
	}
	

	
}