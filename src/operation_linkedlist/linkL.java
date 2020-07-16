package operation_linkedlist;

public class linkL {

    private link head1;
    private link tail1;
    protected link curr1;
    private link head2;
    private link tail2;
    protected link curr2;
    private link head3;
    private link tail3;
    protected link curr3;
    int cnt1,cnt2,cnt3;
    int carry;
    int i;
    boolean cek = false;
        int kurang = 0;
    boolean borrow;
    linkL(int size){
        this();
    }
    linkL(){
        curr1=tail1=head1=new link (null);
        curr2=tail2=head2=new link (null);
        curr3=tail3=head3=new link (null);
        cnt1=0; 
        cnt2=0;
        cnt3=0;
    }
    
    public void show(){
        System.out.print("Elemen dalam list pertama ={ ");
//        while (head1!=tail1){
//            if(head1.getNext()!=null)
//            System.out.print(head1.getNext().getElement());
////            else
////                System.out.print(head1.getElement()+" ");
//            
//            if (head1==curr1)
//                System.out.print("*");
//            else if (head1!=curr1)
//                System.out.print(" ");
//            
//            head1=head1.getNext();
//        }
////        System.out.println(tail1.getElement());
//        System.out.println("}");
//        link look1=head1;
        while (head1!=null){
            if(head1.getNext()!=null)
            System.out.print(head1.getElement());
            else
                System.out.print(head1.getElement()+" ");
            if (head1==curr1)
                System.out.print("*");
            if (head1!=curr1)
                System.out.print(" ");
            head1=head1.getNext();
        }
        //System.out.println(tail.getElement());
        System.out.println("}");
        
        System.out.print("Elemen dalam list kedua ={ ");
        while (head2!=null){
            if(head2.getNext()!=null)
            System.out.print(head2.getElement());
            else
                System.out.print(head2.getElement()+" ");
            
            if (head2==curr2)
                System.out.print("*");
            if (head2!=curr2)
                System.out.print(" ");
            head2=head2.getNext();
        }
//        System.out.println(tail2.getElement());
        System.out.println("}");
        
//        System.out.print("Elemen dalam list ketiga ={ ");
//        while (head3!=null){
//            if(head3.getNext()!=null)
//            System.out.print(head3.getElement());
//            else
//                System.out.print(head3.getElement()+" ");
//            
//            if (head3==curr3)
//                System.out.print("*");
//            if (head3!=curr3)
//                System.out.print(" ");
//            head3=head3.getNext();
//        }
////        System.out.println(tail3.getElement());
//        System.out.println("}");


//        System.out.println("tail1 : "+tail1.getElement());
//        System.out.println("panjang1 : "+cnt1);
//        System.out.println("tail2 : "+tail2.getElement());
//        System.out.println("panjang2 : "+cnt2);
//        System.out.println("tail3 : "+tail3.getElement());
//        System.out.println("panjang3 : "+cnt3);
    }
 
    public void printhasil(link node){
        System.out.print("Elemen dalam list ketiga ={ ");
        curr3=node;
        while (node!=null){
            if(node.getNext()!=null)
            System.out.print(node.getElement());
            else
                System.out.print(node.getElement()+" ");
            
            if (node==curr3)
                System.out.print("*");
            if (node!=curr3)
                System.out.print(" ");
            node=node.getNext();
        }
//        System.out.println(tail3.getElement());
        System.out.println("}");
    }

    public void clear() {
        head1.setNext(null);
        head2.setNext(null);
        head3.setNext(null);
        head1.getNext();
        curr1=tail1=head1=new link (null);
        curr2=tail2=head2=new link (null);
        curr3=tail3=head3=new link (null);
        cnt1=0;
        cnt2=0;
        cnt3=0;
    }


    public void Insert(int element, int lis) {
        link newlink = new link(element);
        if(lis==1){
//            tail1.setNext(newlink);
            newlink.setNext(curr1);
//            tail1=newlink;
            curr1=head1=newlink;
            if(newlink.getNext()==null)tail1=newlink;
//            if(head1==null&&curr1==null) head1=curr1=newlink;
//            if (tail1 == curr1) tail1 = curr1.getNext();
        cnt1++;
        }
        else if(lis==2){
//            tail2.setNext(newlink);
            newlink.setNext(curr2);
//            tail2=newlink;
            curr2=head2=newlink;
            if(newlink.getNext()==null)tail2=newlink;
//            if(head2==null&&curr2==null) head2=curr2=newlink;
//            if (tail2 == curr2) tail2 = curr2.getNext();
        cnt2++;
        }
        else if(lis!=1||lis!=2){
//            tail3.setNext(newlink);
newlink.setNext(curr3);
//            tail3=newlink;
curr3=head3=newlink;
if(newlink.getNext()==null)tail3=newlink;
//            if(head3==null&&curr3==null) head3=curr3=newlink;
//            if (tail3 == curr3) tail3 = curr3.getNext();
        cnt3++;
        }
        
    }
    link reverse(link node){
        link prev = null;
        link current = node;
        link next = null;
        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev=current;
            current= next;
            
        }
        node= prev;
        return node;
    }
    public void print(){
        printhasil(curr3);
    }
 
    public void min(link n, link m){
        int sub;
        
//        if(i==0){
//        long piro = Pengurangan(n,m);
//            System.out.println("hasil : "+piro);
//        if(piro<0){
//            link temp = n; 
//                n = m; 
//                m = temp;
//                kurang=(int) piro;
//            
//        }}
        
//        link temp1 = head1;
//        while (temp1.getNext() != tail1) temp1 = temp1.getNext();
//        tail1 = temp1;

        //min(n.next, m.next);
        
        if(n.getElement()<m.getElement()){ 
//            if((n.getNext()==null||m.getNext()==null)){
//                
//            if (cnt1 < cnt2)  { 
//               if((n.getNext()==null||m.getNext()==null)){
//                 sub=n.getElement()-m.getElement();
//                 if(sub==0){
//                    curr3.setElement(-1*curr3.getElement()); 
//                 }
//                 else
//                    Insert(sub*-1,4); 
//                 
//               } 
//            
//            }
//            else if(cnt1==cnt2&&cek==true){
//                if((n.getNext()==null||m.getNext()==null)){
//                 sub=n.getElement()-m.getElement();
//                 if(sub==0){
//                    curr3.setElement(-1*curr3.getElement()); 
//                 }
//                 else
//                    Insert(sub*-1,4); 
//                 
//               } 
//                cek=false;
//            }
////            else if(cnt1==cnt2&&cek==false){
////                
////            }
//        }
//            else{
            n.setElement(n.getElement()+10);
            sub=n.getElement()-m.getElement();
        Insert(sub,4);
        
        
        n.getNext().setElement((n.getNext().getElement())-1);
        }
        
        else if(n.getElement()>=m.getElement()){
        
        if((n.getNext()==null||m.getNext()==null)){
            if (cnt1 < cnt2)  { 
               if((n.getNext()==null||m.getNext()==null)){
                 sub=n.getElement()-m.getElement();
                 if(sub==0){
                     while(curr3.getElement()==0){
                         curr3=curr3.getNext();
                     }
                    curr3.setElement(-1*curr3.getElement()); 
                 }
                 else
                    Insert(sub*-1,4); 
                 
               } 
            
            }
            else if(cnt1==cnt2&&cek==true){
                if((n.getNext()==null||m.getNext()==null)){
                 sub=n.getElement()-m.getElement();
                 if(sub==0){
                     while(curr3.getElement()==0){
                         curr3=curr3.getNext();
                     }
                    curr3.setElement(-1*curr3.getElement()); 
                 }
                 else
                    Insert(sub*-1,4); 
                 
               } 
                cek=false;
            }
            
            else if(cnt1>=cnt2){
                sub=n.getElement()-m.getElement();
        Insert(sub,4);
            }
        }
//            if(kurang<0){
//            sub=n.getElement()-m.getElement();
////            if(sub==0){
////                curr3.setElement(-1*curr3.getElement());
////            }
////            else
//                Insert(sub*-1,4);}
//        }
        else{
            sub=n.getElement()-m.getElement();
        Insert(sub,4);}}
        
//        if(n.getNext()!=null||m.getNext()!=null){
//            link temp1 = head1;
//            link temp2 = head2;
//        while (temp1.getNext() != n) temp1 = temp1.getNext();
//        while (temp2.getNext() != m) temp2 = temp2.getNext();
//        n = temp1;
//        m = temp2;
//        min(n,m);
//        }
if(n.getNext()!=null||m.getNext()!=null){
//            i++;
            min(n.getNext(),m.getNext());
            
            
        }
        
    }
    
    public void max(link n, link m){
        int sub;
        
        
//        link temp1 = head1;
//        while (temp1.getNext() != tail1) temp1 = temp1.getNext();
//        tail1 = temp1;

        //min(n.next, m.next);
        if(n.getElement()+m.getElement()>9){
            
            sub=(n.getElement()+m.getElement())%10;
            Insert(sub,4);
            if(n.getNext()==null||m.getNext()==null){
                Insert(1,4);
            }
            else
            n.getNext().setElement((n.getNext().getElement())+1);
        }
        else if(n.getElement()+m.getElement()<=9){
            sub=n.getElement()+m.getElement();
            Insert(sub,4);
        }
//        if(n.getNext()!=null||m.getNext()!=null){
//            link temp1 = head1;
//            link temp2 = head2;
//        while (temp1.getNext() != n) temp1 = temp1.getNext();
//        while (temp2.getNext() != m) temp2 = temp2.getNext();
//        n = temp1;
//        m = temp2;
//        min(n,m);
//        }
if(n.getNext()!=null||m.getNext()!=null){
            max(n.getNext(),m.getNext());
        }
        
    }
//    link m(link x, int diff){
//        link z = new link(0);
//        diff--;
//        link temp = z;
//        while((diff--)!=0){
//            temp.setNext(new link(0));
//            temp=temp.getNext();
//        }
//        temp.setNext(x);
//        return z;
//    }
    public void addlists()  {
        link current;
        
        if(curr1==null){
            curr3=curr2;
            return;
        }
        if(curr2==null){
            curr3=curr1;
            return;
        }
        if(length1()==length2()){
            link o = reverse(curr1);
        link p = reverse(curr2);
            max(o,p);
            
        }
        else{
            if (cnt1 < cnt2)  { 
                link temp = curr1; 
                curr1 = curr2; 
                curr2 = temp; 
            } 
            int diff = Math.abs(cnt1 - cnt2); 
  
            // move diff. number of nodes in first list 
            
//            while(diff-- >=0){
    for(int i=0;i<diff;i++){
                link newlink = new link(0);
            newlink.setNext(curr2);
            curr2=newlink;}
            link o = reverse(curr1);
        link p = reverse(curr2);
//            link temp = null;
//
////            temp.setElement(0);
////            while (diff-- >= 0){ 
////                current = temp; 
//                temp.setNext(curr2); 
//            } 
//            curr2 = m(curr2,Math.abs(cnt1 - cnt2));
            max(o, p); 
        }
    }

    public void sublists()  {
        link current;
        
        if(curr1==null){
            curr3=curr2;
            return;
        }
        if(curr2==null){
            curr3=curr1;
            return;
        }
        if(length1()==length2()){
            long piro = Pengurangan(curr1,curr2);
            if(piro<0){
                link temp = curr1;
                curr1 = curr2;
                curr2=temp;
                cek = true;
            }
            link o = reverse(curr1);
        link p = reverse(curr2);
            min(o,p);
            
        }
        else{
            if (cnt1 < cnt2)  { 
                link temp = curr1; 
                curr1 = curr2; 
                curr2 = temp; 
            } 
            int diff = Math.abs(cnt1 - cnt2); 
  
            // move diff. number of nodes in first list 
            
//            while(diff-- >=0){
    for(int i=0;i<diff;i++){
                link newlink = new link(0);
            newlink.setNext(curr2);
            curr2=newlink;}
            link o = reverse(curr1);
        link p = reverse(curr2);
//            link temp = null;
//
////            temp.setElement(0);
////            while (diff-- >= 0){ 
////                current = temp; 
//                temp.setNext(curr2); 
//            } 
//            curr2 = m(curr2,Math.abs(cnt1 - cnt2));
            min(o, p); 
        }
    }
    public void ngakalikali(){
        
        long a = multiplyTwoLists(curr1,curr2);
        String number = String.valueOf(a);
        long c= 10;
        long result;
        for(int i = 0;i<1;i--){
            result=a/c;
            if(result>10)
                c=c*10;
            if(result<10)
                break;
        }
//        System.out.println(c);
        
//        int [] b = new int [number.length()];
        for(int i = 0;i<number.length();i++){
            long dadi = (a/c);
//            b[i]= (int) dadi;
            a=a-(dadi*c);
            c=c/10;
            link newlink = new link((int) dadi);
            newlink.setNext(curr3);
            curr3=head3=newlink;
            if(newlink.getNext()==null)tail3=newlink;
            
//            tail1.setNext(newlink);
////            newlink.setNext(curr1);
//            tail1=newlink;
////            curr1=head1=newlink;
////            if(newlink.getNext()==null)tail1=newlink;
//            if(head3==null&&curr3==null) head3=curr3=newlink;
//            System.out.print(b[i]);
        }
        link o = reverse(curr3);
        printhasil(o);
        
    }
    
    public void ngakalipangkat(){
        
        long a = exponentTwoLists(curr1,curr2);
        String number = String.valueOf(a);
        long c= 10;
        long result;
        for(int i = 0;i<1;i--){
            result=a/c;
            if(result>10)
                c=c*10;
            if(result<10)
                break;
        }
//        System.out.println(c);
        
//        int [] b = new int [number.length()];
        for(int i = 0;i<number.length();i++){
            long dadi = (a/c);
//            b[i]= (int) dadi;
            a=a-(dadi*c);
            c=c/10;
            link newlink = new link((int) dadi);
            newlink.setNext(curr3);
            curr3=head3=newlink;
            if(newlink.getNext()==null)tail3=newlink;
            
//            tail1.setNext(newlink);
////            newlink.setNext(curr1);
//            tail1=newlink;
////            curr1=head1=newlink;
////            if(newlink.getNext()==null)tail1=newlink;
//            if(head3==null&&curr3==null) head3=curr3=newlink;
//            System.out.print(b[i]);
        }
        link o = reverse(curr3);
        printhasil(o);
        
    }


//    public void append(E item) {
//        link<E>look=new link<>(item,null);
//        tail.setNext(look);
//        tail=look;
//        cnt++;
//        /*tail.setNext(new Link<E> (item,null));tail=tail.getNext();nt++;*/
//    }
//
//    @Override
//    public E remover() {
//        if(curr.getNext()==null)
//            return null;
//        E it = curr.getNext().getElement();
//        if(tail==curr.getNext())
//            tail=curr;
//        curr.setNext(curr.getNext().getNext());
//        cnt--;
//        return it;
//
//    }
//
//    @Override
//    public void moveToStart() {
//        curr=head;
//    }
//
//    @Override
//    public void moveToEnd() {
//        link<E> ev=head;
//        while(ev.getNext()!=tail){
//            ev=ev.getNext();
//        }
//        curr=ev;
//    }
    static long multiplyTwoLists ( link first, link second) 
{ 
	int num1 = 0, num2 = 0;
	
	// Generate numbers from linked lists 
	while (first != null || second != null) 
	{ 
		if (first != null) 
		{ 
			num1 = num1*10 + first.getElement(); 
			first = first.getNext(); 
		} 
		if (second != null) 
		{ 
			num2 = num2*10 + second.getElement(); 
			second = second.getNext(); 
		} 
	} 

	// Return multiplication of 
	// two numbers 
	return num1*num2; 
} 
    static long exponentTwoLists ( link first, link second) 
{ 
	int num1 = 0, num2 = 0;
	
	// Generate numbers from linked lists 
	while (first != null || second != null) 
	{ 
		if (first != null) 
		{ 
			num1 = num1*10 + first.getElement(); 
			first = first.getNext(); 
		} 
		if (second != null) 
		{ 
			num2 = num2*10 + second.getElement(); 
			second = second.getNext(); 
		} 
	}

	// Return multiplication of 
	// two numbers 
	return (long) Math.pow(num1, num2); 
}
    static long Pengurangan ( link first, link second) 
{ 
	int num1 = 0, num2 = 0;
	
	// Generate numbers from linked lists 
	while (first != null || second != null) 
	{ 
		if (first != null) 
		{ 
			num1 = num1*10 + first.getElement(); 
			first = first.getNext(); 
		} 
		if (second != null) 
		{ 
			num2 = num2*10 + second.getElement(); 
			second = second.getNext(); 
		} 
	} 

	// Return multiplication of 
	// two numbers 
	return num1-num2; 
} 
    

//
//    public void prev1() {
//        if(curr1==head1)
//            return ;
//        link temp=head1;
//        while(temp.getNext()!=curr1){
//            temp=temp.getNext();
//        }
//     curr1=temp;
//    }

//    @Override
//    public void next1() {
//        if(curr1!=tail1)
//            curr1=curr1.getNext();
//    }


    public int length1() {
       return cnt1;
    }
    public int length2() {
       return cnt2;
    }

//    @Override
//    public int currPos() {
//        link<E> temp=head;
//       int i;
//       for(i=0; curr!=temp; i++)
//           temp=temp.getNext();
//       return i;
//    }
/*
    @Override
    public void moveToPos(int pos) {
        if(pos>=0 && pos<=cnt){
            curr=head;
        for(int i=0; i<pos; i++)
            curr = curr.getNext();
        }
        else{
        System.out.println("Posisi diluar hasil");
        }
    }
*/
//    @Override
//    public E getValue() {
//        if(curr.getNext()==null){
//            E error =(E) "Tidak ada yang didapatkan";
//            return error;
//        }
//        else{
//            return curr.getNext().getElement();
//        }
        
//    }
}
