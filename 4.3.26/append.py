class Solution(object):
    def criticalConnections(self, n, connections):
        from collections import defaultdict  
        graph = defaultdict(list)
        for u, v in connections:
            graph[u].append(v)
            graph[v].append(u)
        disc = [-1] * n
        low = [-1] * n
        time = [0]
        result = []
        
        def dfs(node, parent):
            disc[node] = low[node] = time[0]
            time[0] += 1
            for neighbor in graph[node]:
                if neighbor == parent:
                    continue
                
                if disc[neighbor] == -1:
                    dfs(neighbor, node)
                    low[node] = min(low[node], low[neighbor])
                    if low[neighbor] > disc[node]:
                        result.append([node, neighbor])
                else:
                    low[node] = min(low[node], disc[neighbor])
        dfs(0, -1)
        return result
