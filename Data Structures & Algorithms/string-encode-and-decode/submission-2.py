class Solution:

    def encode(self, strs: List[str]) -> str:

        str= "".join(f"5#{word}" for word in strs)
        return str
    def decode(self, s: str) -> List[str]:
        str = re.split(r'5#', s)[1:] 
        return str