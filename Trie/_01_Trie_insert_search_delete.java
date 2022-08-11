package Trie;

public class _01_Trie_insert_search_delete {
    
    // Structure of TrieNode class
    static class TrieNode{

        TrieNode children[] = new TrieNode[26];

        boolean endOfWord;
        
        TrieNode(){
            endOfWord = false;

            for(int i = 0; i< 26; i++){
                children[i] = null;             // **** IMP
            }
        }
    }


    // TrieNode insert  
    public static void insert( TrieNode root, String str){      // str -> lower case letters

        for(int i = 0; i < str.length(); i++){
            
            if( root.children[ str.charAt(i) - 'a'] == null){

                TrieNode newNode = new TrieNode();

                root.children[ str.charAt(i) - 'a'] = newNode;

            }
            
            root = root.children[ str.charAt(i) - 'a'];
        }

        root.endOfWord = true;
    }

    // searching
    static boolean search( TrieNode root, String str){

        for( int i = 0; i<str.length(); i++){

            if( root.children[ str.charAt(i) - 'a'] == null){
                return false;
            }

            root = root.children[ str.charAt(i) - 'a'];
        }

        return root.endOfWord;
    }

    
    // deleting     --> just endOfWord = false;

    static void delete( TrieNode root, String str){

        for(int i = 0; i<str.length(); i++){
            if( root.children[ str.charAt(i) - 'a'] == null ){
                System.out.println("word not present");
                return;
            }

            root = root.children[ str.charAt(i) - 'a'];
        }
        root.endOfWord = false;
    }



    public static void main(String[] args) {

        TrieNode node = new TrieNode();
        String str = "app";

        insert(node, "app");
        insert(node, "bye");
        insert(node, "apple");
        insert(node, "by");
        insert(node, "apply");

        System.out.println(search(node, "app"));
        System.out.println(search(node, "bye"));
        System.out.println(search(node, "apple"));
        System.out.println(search(node, "by"));
        System.out.println(search(node, "apply"));

        System.out.println("--------- Delete ----------");
        // delete(node, "apy");
        delete(node, "by");
        System.out.println(search(node, "by"));
        System.out.println(search(node, "bye"));


        
    }
}