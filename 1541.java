class P1541 {
    public static void main(String[] args) {
        
    }
    public int minInsertions(String s) {
    int len = s.length(); 
    int globalChange=0;
    int changes = 0;
    int openP = 0;
    char chain='(';
    for( int index=0;index<len;index++)
    {
        char Character = s.charAt(index);
        if( Character == '(' )
            {
                if( chain == ')' )
                { 
                    if( changes < 0 )
                    if( ( -changes & 1 ) == 1 )
                    changes = (-changes+1)/2;
                    else
                    changes = (-changes)/2;

                    globalChange += changes; 
                    openP=0; 
                }

                openP++;
                
                changes = openP*2;            
            }
        else     
            changes--;  
        
        chain = Character;
    }
    return globalChange+changes;    
    }
}