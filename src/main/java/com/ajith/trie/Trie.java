package com.ajith.trie;


import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map <Character,TrieNode> children = new HashMap <> ();
}
public class Trie {

    private TrieNode root;
    private static final Character END = '*';
    public Trie (String str){
        root = new TrieNode ();
        populateSuffixTrie(str);
    }

    private void populateSuffixTrie (String str) {
        for (int i = str.length () -1 ; i >= 0; i--){
            insertPrefixEndingWith ( i ,str );
        }
    }

    private void insertSuffixTrieStartingFrom (int index, String str) {
        TrieNode node = root;
        for (int i = index; i < str.length(); i++){
            char letter = str.charAt ( i );
            if (!node.children.containsKey ( letter )){
                TrieNode newChildNode = new TrieNode ();
                node.children.put ( letter , newChildNode );
            }
            node = node.children.get ( letter );
        }
        node.children.put ( END , null );
    }

    public void  insertPrefixEndingWith (int index, String str) {
        TrieNode node = root;
        for( int i = 0; i <= index ; i ++){
            char letter = str.charAt ( i );
            if(!node.children.containsKey (letter)){
                TrieNode newNode = new TrieNode();
                node.children.put ( letter,newNode );
            }
            node = node.children.get ( letter );
        }
        node.children.put ( END , null );
    }

    public boolean contains(String str) {
        TrieNode node = root;
        for(int i = 0; i < str.length (); i++){
            char letter = str.charAt ( i );
            if(!node.children.containsKey ( letter)){
                return false;
            }
            node = node.children.get ( letter );
        }
        return node.children.containsKey ( END );
    }

}
